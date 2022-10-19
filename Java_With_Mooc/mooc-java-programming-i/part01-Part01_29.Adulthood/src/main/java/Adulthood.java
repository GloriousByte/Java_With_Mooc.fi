
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give a number");
        int input = Integer.valueOf(scan.nextLine());
        if(input>=18){
            System.out.println("adult");
        }else{
            System.out.println("kid");
        }
    }
}
