package Allegro;

import java.time.LocalDateTime;
import java.util.Random;

public class LaptopRentalRepository implements RentalRepository{
    @Override
    public boolean createRental(User user, LocalDateTime datOrder, Product product) {
        return new Random().nextBoolean();
    }
}
