package OLX;

public class Uzytkownik {
    private String name;
    private String surrname;

    public Uzytkownik(String name, String surrname) {
        this.name = name;
        this.surrname = surrname;
    }

    public String getName() {
        return name;
    }

    public String getSurrname() {
        return surrname;
    }
}
