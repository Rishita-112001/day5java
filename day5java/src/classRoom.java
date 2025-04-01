import java.util.Scanner;

public class classRoom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        s1.name = "Riya";
        s1.classNo = "Third";
        s1.sec = "A";
        s1.rollNo = 23;
        System.out.println("Enter the shift based on your preference:");
        System.out.println("1: Morning , 2: Evening");
        s1.pref_shift = sc.nextInt();
        s1.printStudentDetails();
        boolean choice = true;
        while(choice == true) {
            if (s1.pref_shift == 1 || s1.pref_shift == 2 ) {
                s1.PrefSHIFT(s1.pref_shift);
            } else {
                System.out.println("Invalid choice");
                System.out.println("You've entered invalid choice.Enter choice to continue again.");
            }
            choice = sc.nextBoolean();
        }
        System.out.println("No shift assigned.");

    }
}
class Student{
    String name;
    String classNo;
    String sec;
    int rollNo;
    int pref_shift;

    void printStudentDetails(){
        System.out.println("---Student Details---");
        System.out.println("Name:"+name);
        System.out.println("Class:"+classNo);
        System.out.println("Section:"+sec);
        System.out.println("RollNO:"+rollNo);
    }
    void PrefSHIFT(int val){
        switch (val){
            case 1:
                System.out.println("Shift:Morning");
                break;
            case 2:
                System.out.println("Shift:Evening");
                break;

        }
        System.out.println();
    }
}
