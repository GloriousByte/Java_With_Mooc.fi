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
public class Dog {
    private String name;
    private int age;
    private String colour;
    private DogOwner person;
    
    
    
    public Dog(String name){
        
        this(name,0);
    
    
    }
  
    public Dog(String name,DogOwner person){
            this.person=person;
       
            
    
    }
    
    public String getOwner(DogOwner person){
             String owner=person.getName();
             return owner;
    
    }
    
    
    public Dog(String initialName, int age){
        this.name=initialName;
        this.age=age;
        this.colour="pink";
    
    }
    
    public Dog(int age,String colour){
        this.age=age;
        this.colour=colour;
    
    }
    public String getName(){
        return this.name;
    
    }
    
    public void growOlder(int growBy){
        this.age=this.age+growBy;
        System.out.println("new age is "+ this.age);
    }
    
     public void growOlder(){
        this.age=this.age+100000;
        System.out.println("new age is second method  "+ this.age);
    }
    public int getAge(){
        return this.age;
    }
     public String getColour(){
        return this.colour;
    }
    /*public String toString(){
        return this.name + "is a dog";
    }*/
    
  
}
