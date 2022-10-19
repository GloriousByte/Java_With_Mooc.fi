/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class CustomerTacoBox implements TacoBox {
    int amount;
    public CustomerTacoBox(int amount){
        this.amount=amount;
    
    
    }
    
    public void eat(){}
    public int tacosRemaining(){
        return this.amount;
    
    }
    
    
}
