package OLX;


import java.time.LocalDateTime;

public class UtworzenieZamowienia {
    public Zamowienie utworzZamowienie() {
        Uzytkownik uzytkownik = new Uzytkownik("TOmek", "Pioro");
        Auto auto = new Auto("Toyota", "Corolla", 17.000);
        LocalDateTime dateTime = LocalDateTime.of(2022, 9, 18, 12, 52);
        int quantity = 1;

        System.out.println("Otrzymano zapytanie zamówienia");
        System.out.println("Uzytkownik: " + uzytkownik.getName() + " Date: " + dateTime + "\n" + " product: " + auto + " quantity = " + quantity);

        return new Zamowienie(uzytkownik, auto, dateTime, quantity);
    }

}
