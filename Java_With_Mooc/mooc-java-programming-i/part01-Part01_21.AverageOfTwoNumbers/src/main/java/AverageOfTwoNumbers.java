
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Give the first");
       int first = Integer.valueOf(scanner.nextLine());
       System.out.println("Give the second");
       int second = Integer.valueOf(scanner.nextLine());
       double average = (first+second)/(2*1.0);
       System.out.println(average);

    }
}
