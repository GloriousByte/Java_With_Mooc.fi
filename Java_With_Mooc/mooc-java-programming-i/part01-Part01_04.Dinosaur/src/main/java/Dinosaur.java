import java.util.Scanner;
import java.util.ArrayList;
public class Dinosaur {

    public static void main(String[] args) {
          ArrayList <Integer> numbers = new ArrayList<>();
          Scanner scan = new Scanner(System.in);
          
        ToDoList list = new ToDoList();
        
            
    
        UserInterface testly = new UserInterface(list,scan);
        testly.see();
        testly.start();
   

  
    }
}
