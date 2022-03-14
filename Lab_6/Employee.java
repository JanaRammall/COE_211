import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name ");
        firstName = scan.nextLine();
        System.out.println("enter your last name ");
        lastName = scan.nextLine();
        System.out.println("enter your age :");
                age = scan.nextInt();
        System.out.println("enter your salary ");
        salary = scan.nextDouble();




    }

    public  String toString() {
        return "Employee information :" + firstName+
                " "+lastName +","+age+","+salary ;
    }}
