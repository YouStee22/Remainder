package All;

import java.util.Random;

public interface Los {
    default boolean los() {
        return new Random().nextBoolean();
    }
}
