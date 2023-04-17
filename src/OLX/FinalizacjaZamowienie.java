package OLX;

import java.time.Period;

public class FinalizacjaZamowienie {
    MailInformacyjny mailInformacyjny;
    SerwisSprzedarzowyAut serwisSprzedarzowyAut;
    RepozytoriumSerwisuSprzedazowego repozytoriumSerwisuSprzedazowego;

    public FinalizacjaZamowienie(MailInformacyjny mailInformacyjny, SerwisSprzedarzowyAut serwisSprzedarzowyAut, RepozytoriumSerwisuSprzedazowego repozytoriumSerwisuSprzedazowego) {
        this.mailInformacyjny = mailInformacyjny;
        this.serwisSprzedarzowyAut = serwisSprzedarzowyAut;
        this.repozytoriumSerwisuSprzedazowego = repozytoriumSerwisuSprzedazowego;
    }

    public ZamowienieDTO proces(Zamowienie zamowienie) {
        boolean czyUdaloSieFinalnieSprzedac = serwisSprzedarzowyAut.sold(zamowienie.getUzytkownik()
                , zamowienie.getAuto()
                ,zamowienie.getDate()
                ,zamowienie.getQuantity());

        if (czyUdaloSieFinalnieSprzedac) {
            mailInformacyjny.message(zamowienie.getUzytkownik());
            repozytoriumSerwisuSprzedazowego.createProductOrder(zamowienie.getUzytkownik(),
                    zamowienie.getAuto(), zamowienie.getDate(), zamowienie.quantity);
        } else {
            System.out.println("Your order was rejected");
        }

        return new ZamowienieDTO(zamowienie.getUzytkownik(), zamowienie.getAuto(), zamowienie.date, zamowienie.getQuantity(), czyUdaloSieFinalnieSprzedac);

    }
}
