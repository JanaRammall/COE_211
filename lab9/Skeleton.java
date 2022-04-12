 import java.util.Scanner;
 public class Skeleton {
	  public static void main(String[] args) {
        int[] grades = new int[5];
        int sum = 0;
        final int ATTENDANTS = 7;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {

            System.out.println("Input the grade of assignment " + (i + 1));
            grades[i] = scan.nextInt();
        }
        System.out.println("Input the number of attended labs");
        int attendedlabs = scan.nextInt();
        System.out.println("Input the midterm grade");
        int midterm = scan.nextInt();

                for (int i = 0; i < grades.length; i++) {
                    sum = sum + grades[i];
                }
        double assREsult = (sum / 5.0) * 0.3;
        double attResult = (attendedlabs * 100 * 0.05) / ATTENDANTS;
        double midtermResult = midterm * 0.3;


        System.out.println("Assignments(30 %): " + assREsult);
        System.out.println("Attendance(5 %): " + attResult);
        System.out.println("Midterm(30 %): " + midtermResult);
    }
}
