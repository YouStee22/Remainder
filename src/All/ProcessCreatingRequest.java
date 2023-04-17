package All;

import java.time.LocalDateTime;

public class ProcessCreatingRequest implements Los{
    Los los;

    public CreatingRequest process(CreatingRequest creatingRequest) {
        if (los.los()) {
            User user = new User("Thomas");
            Product product = new Car("Toyota", 17900);
            LocalDateTime data = LocalDateTime.of(2022, 12, 12,16, 21);

            return new CreatingRequest(user, product, data);
        } else {
            System.out.println("Nie udało sie utworzyć zamówienia");
            return null;
        }
    }
}
