/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class Song {
    String name;
    String singer;
    int length;
    
    public Song(String name,String singer,int length){
    
        this.name=name;
        this.singer=singer;
        this.length=length;
    }
    
    public int returnLength(){
        return this.length;
    }
    
     public String returnName(){
        return this.name;
    }
     public String returnSinger(){
        return this.singer;
    }
     
    public boolean equals(Object compared){
    
        if(this==compared){return true;}
        if(!(compared instanceof Song)){
            return false;
    
        }
          Song comparedSong = (Song) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedSong.name) &&
            this.singer == comparedSong.singer &&
            this.length == comparedSong.length ) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
        
        
    
        }
    
    
}
