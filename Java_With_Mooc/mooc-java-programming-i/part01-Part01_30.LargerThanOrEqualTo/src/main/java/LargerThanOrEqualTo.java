
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("first number");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("first number");
        int second = Integer.valueOf(scan.nextLine());
        
        if(first>second){
            System.out.println(first + " is greater");
        }else if(second>first){
            System.out.println(second + " is greater");
        }else {
            System.out.println("they are eqwual");
        }
    }
}
