import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class Warehouse {
  Map<String, Integer> maps = new HashMap<>();
  Map<String, Integer> maps2 = new HashMap<>();
  ArrayList <Integer> stocks = new ArrayList<>();
   
    public Warehouse(){}
    
    public void addProduct(String product, int price, int stock){
        this.maps.put(product, price);
        this.maps2.put(product, stock);
        this.stocks.add(stock);
    
    }
    
    public int price(String product){
        product = product.toLowerCase();
        for(String item : this.maps.keySet()){
            if(item.equals(product)){
                return this.maps.get(item);
                
                
            
            }
        
        }return 0;
    
    
    }
    
   public int stock(String product) {
        product = product.toLowerCase();
        for(String item : this.maps2.keySet()){
            if(item.equals(product)){
                return this.maps2.get(item);
                
                
            
            }
        
        }return 0;
   
   
   }
   
   public boolean take(String product){
       
       if(!this.maps2.containsKey(product)){return false;}
       if(this.maps2.get(product)-1>=0){
          int holder=this.maps2.get(product);
          this.maps2.remove(product,holder);
          this.maps2.put(product,holder-1);
           
           return true;
           
       }else{return false;}
   
   }
   
   public Set<String> products(){
       Set <String> things = new HashSet<>();

       for(String entity : this.maps2.keySet()){
           things.add(entity);
       
       }
       return things;
      
   
   }
    
}
