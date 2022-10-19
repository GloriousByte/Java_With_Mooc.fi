import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;



public class ShoppingClass {
    Map<String, Integer> maps = new HashMap<>();
    
    public void add(String product, int price){
        if(maps.containsKey(product)){
            this.increaseQuantity(product);
            this.maps=this.findNumberOfItems();
        
        }
        else{
        this.maps.put(product,price);}
    
    }
    
    public int price(){
        int tots=0;
        for(String entity : this.maps.keySet()){
            tots= tots+this.maps.get(entity);
        }
        return tots;
    }
    
    
    public void print(){   
        System.out.println(this.findNumberOfItems());
    }
       //create a new arraylist 
       //add each key in maps hashmap
       //forCount arraylist now has every key value in hashmap
        
    public HashMap<String,Integer> findNumberOfItems(){
    
    ArrayList <String> forCount = new ArrayList<>();
       for(String entity : this.maps.keySet()){
           forCount.add(entity);
         
       
       }
       
       //initialiize a count variable to 0
       //initialize a string varuiable to zero
       //create a new hashmap called wordAndValue
      
       int count=0;
       String currentWord="";
       HashMap <String,Integer> wordAndValue = new HashMap<>();
       
       //check  word in forCount arraylist to see whether it's already a key word in  wordAndValue
       //if yes,check the next word
       //if not then assign that word to currentWord
       for(int i=0;i<forCount.size();i++){
           if(wordAndValue.containsKey(forCount.get(i))){
               continue;
           
       
           }else{ currentWord =forCount.get(i);
               
               
           
           }
           
           //after assigning the word, iterate over forCount to see how many times it occurs
       
           for(int j=0;j < forCount.size();j++){
               
               if(forCount.get(j).equals(currentWord)){
                   count++;
               
               }
           
           }
           //after you are done counting the number of occurences add that the currentWord and count as a value pair to wordAndValue
           wordAndValue.put(currentWord,count);
           //change count to zero and current word to empty
           count=0;
           currentWord="";
           
           
           
       
       }
            
        for(String entity : wordAndValue.keySet()){
            System.out.println(entity + ":" + wordAndValue.get(entity));
        
        }
        return wordAndValue;
        
    
    }

    
    public void increaseQuantity(String product){
       int hold= this.maps.get(product) + this.maps.get(product);
       int oldVal = this.maps.get(product);
       this.maps.remove(product,oldVal);
       this.maps.put(product,hold);
       
    
    }
}
