
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The First String");
        String first = scan.nextLine();
        System.out.println("Enter The Second String");
        String second = scan.nextLine();
        
        if(first.equals(second)){
            System.out.println("they are the same");
        }else{System.out.println("they are not same");
        }
        
        
    }
}
