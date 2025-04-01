public class employeeClass {
    public static void main(String[] args){
        Employee emp = new Employee("Rishita","Manager",100000000);
        System.out.println("Before Salary Update");
        emp.displayDetails();
        emp.CalculateAndUpdate(20);
        System.out.println("After Salary Update");
        emp.displayDetails();
    }
}
class Employee{
    String name;
    String jobTitle;
    int salary;

    void CalculateAndUpdate(int perIncrease){
        salary = salary*perIncrease;
    }
    void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }
    Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}