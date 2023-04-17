package Allegro;

import java.time.LocalDateTime;

public interface RentalService {
    public boolean rent(User user , LocalDateTime dataOrder, Product product);
}
