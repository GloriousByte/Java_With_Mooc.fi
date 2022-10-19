import java.util.ArrayList;
public class Box implements Packable{
    
    double boxSize;
    ArrayList <Packable> box = new ArrayList<>();
   
    
    
    public Box(double boxSize){
        this.boxSize=boxSize;
    
    }
    
    public void add(Packable item){
        box.add(item);
    
    }
    public double weight(){
        double totalWeight=0;
        for(Packable item : box){
            totalWeight = totalWeight + item.weight();
            
        
        }
        return totalWeight;
    
    }
    
    public String toString(){
        
        return " Box: " + box.size() + "items" + "   total weight: " + Math.ceil(this.weight());
    
    }
    
}
