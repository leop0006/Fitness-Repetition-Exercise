public class Administration extends Employee {
    private int vacation;

    public Administration(String navn, String cpr, int vacation) {
        super(navn, cpr);
        this.navn = navn;
        this.cpr = cpr;
        this.vacation = vacation;

    }

    public int getVacation() {
        return vacation;
    }


}
