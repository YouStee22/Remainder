package OLX;

public class Olx {
    public static void main(String[] args) {
        UtworzenieZamowienia utworzenieZamowienia = new UtworzenieZamowienia();
        Zamowienie zamowienie = utworzenieZamowienia.utworzZamowienie();

        FinalizacjaZamowienie finalizacjaZamowienie = new FinalizacjaZamowienie(new MailInformacyjny(), new SerwisSprzedarzowyAut(), new RepozytoriumSerwisuSprzedazowego());
        finalizacjaZamowienie.proces(zamowienie);
    }
}
