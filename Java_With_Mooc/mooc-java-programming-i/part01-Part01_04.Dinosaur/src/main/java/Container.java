/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class Container {
    int value;
    
    public Container(){
        this.value=0;
    }
    
    public int contains(){
        return this.value;
    }
    public void add(int value){
        if(this.value+value<=100){
        this.value=this.value+value;
        }else{this.value=100;}
    
    }
    
    public void remove(int amount){
        if(this.value-amount>=0){
        this.value=this.value-amount;
        }else{this.value=0;};
    
    }
    public String toString(){
        return this.value + " /100";
    
    }
    
}
