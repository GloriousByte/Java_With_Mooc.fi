/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class ClockHand {
    
    int limit;
    int value;
    public ClockHand(int limit){
        this.limit = limit;
        this.value=0;
    
    
    }
    
    public int advance(){
        if(this.value<this.limit && this.value+1<this.limit){
        
            this.value++;
        }else {this.value=0;}
        return this.value;
    
    }
    
    public int getValue(){
        return this.value;
    
    }
    public String toString(){
        if(this.value<10){
            return " 0" + this.value +" ";
        
        }else{
            return " " +this.value+ " ";
        
        }
    
    }
    
    
    
}
