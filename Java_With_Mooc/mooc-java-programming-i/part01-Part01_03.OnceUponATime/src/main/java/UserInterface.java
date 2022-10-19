import java.util.Scanner;
import java.util.ArrayList;


public class UserInterface {
    private Scanner scanner;
    private TodoList tasks;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.tasks = new TodoList();
    }

    public void start() {
       while (true){
           System.out.print("command:");
           String task=this.scanner.nextLine();
           if(task.equals("stop")){break;
           }
           
           if(task.equals("add")){
              
               this.tasks.add(task);
           
           }
           if(task.equals("list")){
               tasks.print();
           
           }if(task.equals("remove")){
               System.out.println("which index?");
               int value=Integer.valueOf(this.scanner.nextLine());
               tasks.remove(value);
           
           }
       
       
       
       }

       
    }

    
}