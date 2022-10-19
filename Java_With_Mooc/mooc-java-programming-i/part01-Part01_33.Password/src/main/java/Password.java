
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      System.out.println("Input password");
      String password = scan.nextLine(); 
      if(password.equals("Caput Draconis")){
            System.out.println("welcome!");
        }else{
            System.out.println("off with you!");
         }
    }
}