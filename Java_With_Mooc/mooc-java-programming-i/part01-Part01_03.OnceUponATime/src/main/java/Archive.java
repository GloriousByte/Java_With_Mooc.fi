/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class Archive {
    String identifier;
    String name;
    
    public Archive(String identifier, String name){
    
        this.identifier=identifier;
        this.name=name;
    }
    
   
    public String getIdentifier(){
        return this.identifier ;
    }
     public String getName(){
        return this.name ;
    }
    
     public boolean equals(Object compared){
    
        if(this==compared){return true;}
        if(!(compared instanceof Archive)){
            return false;
    
        }
        Archive comparedbook = (Archive) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.identifier.equals(comparedbook.getIdentifier()) &&
            this.name.equals(comparedbook.getName())
            ) {
            return true;
        }else{

        // otherwise the objects are not equal
        return false;}
        
        
    
        }
     
     public String toString(){
        return this.identifier + ":" + this.name;
    }
}
