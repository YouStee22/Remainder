package Allegro;

import java.time.LocalDateTime;

public interface RentalRepository {
    public boolean createRental(User user, LocalDateTime datOrder, Product product);
}
