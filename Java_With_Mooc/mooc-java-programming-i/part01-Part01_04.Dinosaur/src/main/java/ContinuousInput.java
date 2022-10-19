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
public class ContinuousInput {
    Scanner scan ;
    
    public ContinuousInput(Scanner scan){
        this.scan = scan;
    }
    
    
    public int letsBegin(){
    
            System.out.println("enter a number");
            String number = scan.nextLine();
            int numberValue = Integer.valueOf(number);
            if(number.equals("end")){
                System.out.println("done");
                return 0;
            
            }else {return numberValue;
            
            }
            
              
        
    
          
    }

    
}
