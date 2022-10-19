/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
import java.util.ArrayList;
public class Package {
    ArrayList<Gift> gifts = new ArrayList<>();
    int recordWeight;
    
    public Package(){
    this.recordWeight=0;}
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
        this.recordWeight=this.recordWeight+gift.getWeight();
        
    
    }
    public int totalWeight(){
       
        return recordWeight;
    }
    
    public Gift getHeaviest() {
    // return a null reference if there's no one on the ride
    if (this.gifts.isEmpty()) {
        return null;
    }
    Gift returnObject = this.gifts.get(0);

    for(Gift item : gifts){
        if(item.getWeight()>returnObject.getWeight()){
            returnObject = item;
        
        
        }
    
    }
    return returnObject;
    
    
        
    }  
}
