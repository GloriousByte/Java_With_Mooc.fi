
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("give a number");
        int input = Integer.valueOf(scan.nextLine());
        if(input>=0){
            System.out.println("is positive");
        }else{
            System.out.println("is negative");
        }
        
    }
}
