/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
public class AverageNumber {
    Scanner scan = new Scanner(System.in);
    ArrayList <Integer> numbers = new ArrayList<>();
    int sum =0;
    
    public AverageNumber(Scanner scan){
        this.scan = scan;
    
    }
    public int findAverage(){
        
        while(true){
        ContinuousInput input = new ContinuousInput(this.scan);
        int userInput = input.letsBegin();
        if (userInput==0){
            int denominator = numbers.size();
            for (int value : numbers)
            {this.sum= this.sum+ value;}
            System.out.println(sum + "is the sum");;
            return -1;
        
        }else{
        numbers.add(userInput);}
      
        }
        
        
    }
    
    
    
    
}
