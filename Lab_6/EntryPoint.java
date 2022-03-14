import java.util.Scanner ;
public class EntryPoint {

    public static void main(String[]args ) {
        Scanner scan = new Scanner(System.in);
        String input = null;

boolean answer = true ;
       while (answer==true ) {System.out.println("Which service would you like to use?\n" +
                    "[1]: Basic week visualizer\n" +
                    "[2]: Advanced week visualizer\n" +
                    "[3]: Basic calculator\n" +
                    "[4]: Employee repertoire\n");

            int x = scan.nextInt();
           while (x>4||x<0){
               System.out.println("please enter a valid number ranging between 0 (exclusive)and 4 (exclusive)");
               x = scan .nextInt();
           }

            switch (x) {

                case 1:
                    BasicWeek.printDays();
                    break;
                case 2:
                    AdvancedWeek.printDays();
                    break;
                case 3:
                    new Calculator();
                    break;
                case 4:
                    Employee employee1 = new Employee();
                   System.out.print( employee1.toString());
                default:}



        System.out.println(" Would you like to perform another operation? (y/n)\n");
           scan.nextLine();

        input = scan.nextLine();
         String y = "y";
        if (input.equals(y)){
            answer=true;

        }
        else {
answer=false;

        }
       
       }



}}
