import java.sql.SQLOutput;
import java.util.Scanner;

//Task 1
public class main {
    public static void main (String[] args) {
        // Task 1

        // System.out.println("This is your lowest number: " + FindingLowestNumber());
        //System.out.println(BelowOrAbove(1));
        //MiddleChar("");
    }




    public static double FindingLowestNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value: ");
        double FirstValue = scanner.nextDouble();
        System.out.println("Please enter second value: ");
        double SecondValue = scanner.nextDouble();
        System.out.println("Please enter third value: ");
        double ThirdValue = scanner.nextDouble();

        System.out.printf("First Value =%.2f%nSecond Value =%.2f%nThirdvalue =%.2f%n",FirstValue, SecondValue, ThirdValue);
        return Math.min(Math.min(FirstValue, SecondValue ), ThirdValue);

    }
    // Task 2
    public static String BelowOrAbove(int Number){
        if (Number > 0){
            return new String("is positive");
        } else if (Number == 0){
            return new String("is zero");
        } else {
            return new String("is negative");
        }
    }
    // Task 3
    public static void MiddleChar(String Name){
        if (Name.length() %2==0 && !Name.equals("")){
            System.out.println(Name.substring(Name.length()/2-1,Name.length()/2+1));
        } else if (Name.length() % 2 == 1) {
            System.out.println(Name.charAt(Name.length()/2));
        } else if (Name.equals("")){
            System.out.println("is empty");
        }
    }
}