import java.util.Scanner;
import java.util.Random;
public class EntryPoint
{
	public static void main(String[] args) {
	
    Random rnd = new Random();
   System.out.println("employee: "+(rnd.nextInt(10)+1));
     int i = 4;
           
    Scanner scan = new Scanner(System.in);
     while(i>0){
                                                                System.out.println("You have "+ i + " insertions left");
      i--;
     break;}
    System.out.println("Please input the employee's first name:");

    String FirstName = scan.nextLine();
          while(i>0){
          System.out.println("You have "+ i + " insertions left");
           i--;
           break;}
    System.out.println("Please input the employee's last name:");
    String  LastName = scan.nextLine();
    while(i>0){
     System.out.println("You have "+ i + " insertions left");
      i--;
     break;}
    System.out.println("Please input the employee's age:");
     
    int age =scan.nextInt();
    while(i>0){
     System.out.println("You have "+ i + " insertions left");
      i--;
     break;}
    System.out.println("Please input the employee's monthly salary: ");
    double MonthlySalary = scan.nextDouble();

    Employee emp1 = new Employee(FirstName,LastName,age,MonthlySalary);
    System.out.println("Employee information: "+emp1.FirstName+" "+emp1.LastName+","+emp1.age+","+emp1.MonthlySalary);}}


