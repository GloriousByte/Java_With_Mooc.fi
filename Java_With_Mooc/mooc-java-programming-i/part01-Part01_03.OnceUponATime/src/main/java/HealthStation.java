/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class HealthStation {
    int age;
    int visits=0;
    
    public HealthStation(int age){
    
        this.age=age;
    }
    
    public void increaseAge(Dog puppy){
        
        int newAge=puppy.getAge()+this.age;
        puppy.growOlder(newAge);
        this.visits++;
        System.out.println("your new age is "+ puppy.getAge()+ " also we have " + visits + " visits !");
        
    
        
    }
    
}
