public class Member extends Person {
    private boolean isBasic;
    private String memberType;
    private int monthlyFee;

    public Member(String navn, String cpr, boolean isBasic) {
        super(navn, cpr);
        this.isBasic = isBasic;
    }

    /*
    @Override
    public String toString()
    {
        if (this.isBasic){
            return ("Basic");
        }
        else
        {
            return("Full");
        }
    }
*/


    public String getMemberType() {
        if (!isBasic) {
            return "Full";

        } else {

            return "Basic";
        }
    }


    public int monthlyFee() {

        if (!isBasic) {
            return 299;
        }
        else {
            return 199;
        }

    }
}
