
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third");
        int third = Integer.valueOf(scanner.nextLine());
        System.out.println(first + second + third);
        

    }
}
