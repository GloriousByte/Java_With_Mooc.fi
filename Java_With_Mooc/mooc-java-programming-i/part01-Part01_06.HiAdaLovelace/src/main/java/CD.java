/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class CD implements Packable{
    String artist;
    String name;
    double weight;
    int pubDate;
    
    public CD(String artist,String name,int pubDate){
        this.artist=artist;
        this.name=name;
        this.weight=0;
        this.pubDate=pubDate;
    }
    
     public String toString(){
         return this.artist + " : " + this.name + "(" + this.pubDate + ")"; 
     
     }
     
     public double weight(){
         return this.weight;
     
     } 
}
