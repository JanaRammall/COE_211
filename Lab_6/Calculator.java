import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
        System.out.println("enter the first number  ");
        num1 = scanCalc.nextInt();
        scanCalc.nextLine();
        System.out.println("enter  the operator  ");
        operator  = scanCalc.nextLine();
        System.out.println("enter the second number ");
        num2 = scanCalc.nextInt();

        switch(operator ){
            case "+":  System.out.print("the answer is:  "+add(num1,num2));
break;
            case "-" :
                System.out.println("the answer is: "+subtract(num1,num2));
            break;

            case "/" :
                System.out.println("the answer is: "+divide(num1,num2));
            break;
            case  "*":
                System.out.println("the answer is : "+multiply (num1,num2));
            default :
        }


        // Decide on the operation to perform
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    }

    public String add(int a, int b) {
        return ""+(a+b) ;
    }

    public String subtract(int a, int b) {
        return  ""+ (a-b);
    }

    public String multiply(int a, int b) {
        return ""+(a*b);
    }

    public String divide(int a, int b) {
       return ""+((double)a/b);
    }
}
