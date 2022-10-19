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
public class CubeInput {
    Scanner scan;

    
    public CubeInput(Scanner scanner){
        this.scan = scanner;
        
    
    }
    public void letsGo(){
        while(true){
        
        System.out.println("Tell me a number");
        String userInput = scan.nextLine();
        if(userInput.equals("end")){
            System.out.println("done");
            break;
        
        }else{
        int numberInput= Integer.valueOf(userInput);
        CubeFinder test = new CubeFinder(numberInput);
        int squaredNumber=test.result();
        System.out.println(squaredNumber);}
    }
        
    }
}
