package All;

import java.time.LocalDateTime;

public class CreatingRequest {
    User user;
    Product product;
    LocalDateTime dateOrder;

    public CreatingRequest(User user, Product product, LocalDateTime dateOrder) {
        this.user = user;
        this.product = product;
        this.dateOrder = dateOrder;
    }
}
