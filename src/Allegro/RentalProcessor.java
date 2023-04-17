package Allegro;

import java.time.LocalDateTime;

public class RentalProcessor {
    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(InformationService informationService, RentalService rentalService, RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDTO process (User user, LocalDateTime orderDate, Product product) {
        boolean isRented = rentalService.rent(user, orderDate, product);

        if (isRented) {
            informationService.inform(user);
            rentalRepository.createRental(user, orderDate, product);
            return new RentalDTO(user, true);
        } else {
            return new RentalDTO(user, false);
        }
    }
}
