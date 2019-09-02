public class Person {
    protected String navn;
    protected String cpr;


    public Person(String navn, String cpr) {
        this.navn = navn;
        this.cpr = cpr;
    }

    public String getNavn() {
        return navn;
    }

    public String getCpr() {
        return cpr;
    }
}
