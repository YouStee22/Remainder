package Allegro;

import java.time.LocalDateTime;
import java.util.Random;

public class LaptopRentalService implements RentalService{
    @Override
    public boolean rent(User user, LocalDateTime dataOrder, Product product) {
        return new Random().nextBoolean();
    }
}
