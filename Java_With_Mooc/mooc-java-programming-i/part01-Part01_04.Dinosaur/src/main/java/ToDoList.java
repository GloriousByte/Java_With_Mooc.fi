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
public class ToDoList {
    ArrayList <String> myTodos = new ArrayList <>();
    
    public ToDoList(){}
    
    public void add(String task){
        myTodos.add(task);
        
    
    }
    public void print(){
        for(int i =0;i<myTodos.size();i++){
            System.out.println((i+1) +":"+ myTodos.get(i) );
        
        }
    
    }
    public void remove(int number){
        
        myTodos.remove(number-1);
    
    
    }
    
    
    
    
}
