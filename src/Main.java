import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args){


        List<Member> members = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();


        members.add(new Member("Lukas", "221175-1140", false));
        members.add(new Member("Brian", "425625-6782", true));
        members.add(new Member("Michael", "324391-2423", false));
        members.add(new Member("Jarl", "350385-1125", true));


        employeeList.add(new Employee("Lars","294355-6789", 37 ));
        employeeList.add(new Administration("Frederik","228367-5500", 3 ));
        employeeList.add(new Instructor("Leopold","622347-4289", 18 ));

        printNavnCpr((ArrayList<Member>) members, (ArrayList<Employee>) employeeList);
        fitnessMembers((ArrayList<Member>) members);
        fitnessEmployees((ArrayList<Employee>) employeeList);



        }

    public static void printNavnCpr(ArrayList<Member> members, ArrayList<Employee> employeeList){

        System.out.println("Employees & Members - Name og Cpr");
        asterisk();
        System.out.printf("%-12s%-12s\n", "Name", "Cpr");
        for (Member m :
            members) {
            System.out.printf("%-12s%-12s\n", m.getNavn(), m.getCpr());
        }

        for (Employee e :
            employeeList) {
            System.out.printf("%-12s%-12s\n", e.getNavn(), e.getCpr());
        }
        end();

    }

    public static void fitnessMembers (ArrayList<Member> members){
        System.out.println("Fitness Members");
        asterisk();
        System.out.printf("%-12s%-12s\n", "Name", "Cpr", "Member type", "Fee");
        for (Member m :
            members) {
            System.out.printf("%-15s%-12s-%-15s%-12s\n", m.getNavn(), m.getCpr(), m.getMemberType(), m.monthlyFee());
        }
        end();

    }

    public static void fitnessEmployees (ArrayList<Employee> employeeList){
        System.out.println("Fitness Employees");
        asterisk();
        System.out.printf("%-15s%-12s-%-15s%-12s\n", "Name", "Cpr", "Hours", "Salary", "Vacation");

        for (Employee e :
             employeeList) {
            if (e instanceof  Administration) {
                System.out.printf("%-15s%-12s-%-15s%-12s\n", e.getNavn(), e.getCpr(), e.getHours(), e.getSalary(), ((Administration) e).getVacation() );
            } else {
                System.out.printf("%-15s%-12s-%-15s%-12s\n", e.getNavn(), e.getCpr(), e.getHours(), e.getSalary());
            }


        }
        end();
    }


    //Metode for asterisk *
    public static void asterisk(){
        for (int i = 0; i < 50; i++){
            System.out.print("x");
        }
        System.out.println("");
    }

    public static void end() {
        for (int i = 0; i < 50; i++){
            System.out.print("=");
        }
        System.out.printf("\n\n");
    }


}
