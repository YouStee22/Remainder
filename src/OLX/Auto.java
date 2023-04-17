package OLX;

public class Auto {
    private String nazwaProduktu;
    private String opis;
    private double cena;

    public Auto(String nazwaProduktu, String opis, double cena) {
        this.nazwaProduktu = nazwaProduktu;
        this.opis = opis;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", opis='" + opis + '\'' +
                ", cena=" + cena;
    }
}
