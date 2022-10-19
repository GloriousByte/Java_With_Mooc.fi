/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class DecreasingCounter {
    
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if(this.value>0){
            this.value=this.value-1;
        }else{System.out.println("can't decrease anymore");}
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
    }

    public void reset(){
        this.value=0;
    }
}
    

