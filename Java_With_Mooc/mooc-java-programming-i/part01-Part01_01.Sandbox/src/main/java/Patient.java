/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class Patient {
    private String name;
    private int weight;
    
    public Patient(String name, int weight){
        this.name=name;
        this.weight=weight;
     
                
    }
    
    public int weight(){
        return this.weight;
    }
    
     public String name(){
        return this.name;
    }
     
     public void changeWeight(int addToWeight){
         this.weight=this.weight+addToWeight;
     }
}
