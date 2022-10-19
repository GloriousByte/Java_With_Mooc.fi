
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Give the first");
       int first = Integer.valueOf(scanner.nextLine());
       System.out.println("Give the second");
       int second = Integer.valueOf(scanner.nextLine());
       int plus = first + second;
       int minus = first - second;
       int multi = first * second;
       double divi = first/(second*1.0);
               
       System.out.println(plus);
       System.out.println(minus);
       System.out.println(multi);
       System.out.println(divi);
    }
}
