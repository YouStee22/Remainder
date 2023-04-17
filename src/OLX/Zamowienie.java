package OLX;

import java.time.LocalDateTime;

public class Zamowienie {
    Uzytkownik uzytkownik;
    Auto auto;
    LocalDateTime date;
    int quantity;

    public Zamowienie(Uzytkownik uzytkownik, Auto auto, LocalDateTime date, int quantity) {
        this.uzytkownik = uzytkownik;
        this.auto = auto;
        this.date = date;
        this.quantity = quantity;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public Auto getAuto() {
        return auto;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }
}
