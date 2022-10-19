/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
import java.util.Scanner;
public class UserInterface {
    ToDoList list;
    Scanner scan;
    
    public UserInterface(ToDoList list, Scanner scan){
        this.list = list;
        this.scan = scan;
    
    }
    public void see(){System.out.println("I work");}
    public void start(){
        while(true){
            
            System.out.println("command: ");
            String userInput=this.scan.nextLine();
            
            if(userInput.equals("stop")){
                break;
            
            }
            if (userInput.equals("add")){
                
                System.out.println("to add: "); 
                String listItem = this.scan.nextLine();
                list.add(listItem);
             
            
            }
            if(userInput.equals("list")){
                list.print();
            
            
            }
            if(userInput.equals("remove")){
                System.out.println("enter id of choice");
                String idChoice = this.scan.nextLine();
                int idChoiceConverted = Integer.valueOf(idChoice);
                list.remove(idChoiceConverted);
                
            
            }
        
        }
    
    
    }
    
}
