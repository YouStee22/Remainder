package OLX;

import java.time.LocalDateTime;

public class ZamowienieDTO {
    Uzytkownik uzytkownik;
    Auto auto;
    LocalDateTime dataOrder;
    int quantity;
    boolean czySprzedane;

    public ZamowienieDTO(Uzytkownik uzytkownik, Auto auto, LocalDateTime dataOrder, int quantity, boolean czySprzedane) {
        this.uzytkownik = uzytkownik;
        this.auto = auto;
        this.dataOrder = dataOrder;
        this.quantity = quantity;
        this.czySprzedane = czySprzedane;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public Auto getAuto() {
        return auto;
    }

    public LocalDateTime getDataOrder() {
        return dataOrder;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isCzySprzedane() {
        return czySprzedane;
    }
}
