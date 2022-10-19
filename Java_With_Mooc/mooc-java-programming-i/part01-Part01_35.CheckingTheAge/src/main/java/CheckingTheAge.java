
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an age");
        int input = Integer.valueOf(scan.nextLine());
        if (input>0 && input<120){
            System.out.println("okay");
        }else{System.out.println("impossible!");
        }
    }
}
