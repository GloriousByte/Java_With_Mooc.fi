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
public class TodoList {
    
    ArrayList <String> diary;
    
    public TodoList(){
        this.diary=new ArrayList<>();
    
    }
    
    public void add(String task){
        this.diary.add(task);
    }
    
    public void print(){
        for(int i=0;i<diary.size();i++){
            String toDo= diary.get(i);
            System.out.println((i+1)+ " : " + toDo);
        
        }
    }
    
    public void remove(int number){
        diary.remove(number-1);
    
    }
    
}
