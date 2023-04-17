package Allegro;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        User user = new User("Thomas", "Pioro");

        LocalDateTime dataOrder = LocalDateTime.of(2022, 12, 12, 15, 43);
        Product product = new Laptop("MacBook", "Pro 2022", 10999);

//        MailService mailService = new MailService();
//
//        ProductRentalService productRentalService = new ProductrentalService();
//        boolean isResult = carRentalService.rent(user, dataOrder, product);
//
//        ProductRentalRepository productRentalRepository = new ProductRentalRepository();
//
//
//        if (isResult) {
//            mailService.sendEmail(user);
//            productRentalRepository.createProductRental(user, dataOrder, product);
//        } else {
//            System.out.println("Your order was rejected!");
//        }

        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(), new LaptopRentalService(), new LaptopRentalRepository());
        rentalProcessor.process(user , dataOrder, product);
    }
}
