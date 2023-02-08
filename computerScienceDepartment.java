public class computerScienceDepartment {
    public static void main(String[] args) {
        System.out.println("begin main");
        ProfessorDetails professor1 = new ProfessorDetails(1500,"Samriddha",5000);
        ProfessorDetails professor2 = new ProfessorDetails(2500,"Dhawa",10000);
        ProfessorDetails professor3 = new ProfessorDetails(3500,"Shailesh",15000);
        ProfessorDetails professor4 = new ProfessorDetails(4500,"Michael",20000);

        professor1.printProfessorDetails();
        professor2.printProfessorDetails();
        professor3.printProfessorDetails();
        professor4.printProfessorDetails();


        System.out.println("withdrwaing list");
        professor1.withdraw(100);
        professor2.withdraw(200);
        professor3.withdraw(300);
        professor4.withdraw(400);

        { System.out.println("..................................");}

        System.out.println("depositing money");
        professor1.deposit(500);
        professor1.deposit(600);
        professor3.deposit(700);
        professor4.deposit(800);


        professor1.printProfessorDetails();
        professor2.printProfessorDetails();
        professor3.printProfessorDetails();
        professor4.printProfessorDetails();


        System.out.println("end main..");
    }
}
class ProfessorDetails
{
    //FIELDS/DATA MEMBER
    private int professorCode;
    private String professorName;
    private double professorBalance;
    //LOCAL VARIABLES

    // a constructor function has the same name "as of the class"
    // it does not have return type
    // it can take arguments (if it want)
    // what is the use of this function?, lets see


    ProfessorDetails(int professorCode, String professorName, double professorBalance) {
        System.out.println("Constructor is setting the initial details...");
        this.professorCode = professorCode;
        this.professorName = professorName;
        this.professorBalance = professorBalance;
    }

    void printProfessorDetails() {
        System.out.println("Professor Code  : "+professorCode);
        System.out.println("Professor Name  : "+professorName);
        System.out.println("Professor Balance : "+professorBalance);
        System.out.println("----------------------------");
    }

    { System.out.println("----------------------------"); }

    void withdraw(double withdrawAmount) {
        System.out.println("Withdrawing...."+ withdrawAmount);
        professorBalance = professorBalance - withdrawAmount;


    }
    void deposit(double depositAmount) {
        System.out.println("Depositing...."+ depositAmount);
        professorBalance = professorBalance + depositAmount;

    }

}
