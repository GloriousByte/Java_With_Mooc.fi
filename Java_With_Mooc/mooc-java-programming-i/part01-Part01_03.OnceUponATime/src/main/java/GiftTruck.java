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
public class GiftTruck {
    
    ArrayList <Package> packages = new ArrayList<>();
    ArrayList <Package> packa;

    String test;
    int totalWeight;
    int packagesNo;
    
    public GiftTruck(){
        this.totalWeight=0;
        this.packagesNo=0;
        
    
    }
    public void addPackage(Package item){
     this.test ="hello";
     if(item.totalWeight()+this.totalWeight<20){
         packages.add(item);
         this.packagesNo++;
         this.totalWeight=this.totalWeight+item.totalWeight();
     
     }else{System.out.println("limit reached");}
   
    
    }
    
    public String toString(){
        return this.packagesNo + "(" + this.totalWeight + "kg)";
    
    }
    
    public void printItems(){
    
    for(Package item : packages){
        System.out.println(item);
    
    }
    }
    
}
