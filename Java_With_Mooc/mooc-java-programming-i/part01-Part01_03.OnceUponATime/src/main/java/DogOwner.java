/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class DogOwner {
    String name;
    Dog dog;
    
    public DogOwner(String name,Dog dog){
    this.name=name;
    this.dog=dog;
    
    }
    
    public void whoIsDog(){
    
        System.out.println(this.dog +" is owned by " + this.name);
    }
    public String getName(){
        return this.name + " ";
    
    }
    public String toString(){
        return this.name + "owns "+this.dog ;
    }
}
