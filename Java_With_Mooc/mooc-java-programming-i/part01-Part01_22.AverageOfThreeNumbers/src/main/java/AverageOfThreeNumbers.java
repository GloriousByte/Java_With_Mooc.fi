
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Give the first");
       int first = Integer.valueOf(scanner.nextLine());
       System.out.println("Give the second");
       int second = Integer.valueOf(scanner.nextLine());
       System.out.println("Give the third");
       int third = Integer.valueOf(scanner.nextLine());
       double average = (first+second+third)/(3*1.0);
       System.out.println(average);

    }
}
