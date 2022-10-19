
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String aString = scan.nextLine();
        System.out.println("Give an integer:");
        int anInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double aDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean aBoolean = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+aString);
        System.out.println("You gave the integer "+anInt);
        System.out.println("You gave the double "+aDouble);
        System.out.println("You gave the boolean  "+ aBoolean);
        

    }
}
