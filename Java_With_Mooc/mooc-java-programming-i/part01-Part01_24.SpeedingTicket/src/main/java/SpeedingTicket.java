
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("tell me a number");
        int input = Integer.valueOf(scanner.nextLine());
        if(input>120){
            System.out.println("Speeding Ticket!");
        }
        
    }
}
