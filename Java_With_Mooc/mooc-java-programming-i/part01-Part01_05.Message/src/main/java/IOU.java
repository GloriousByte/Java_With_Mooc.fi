import java.util.HashMap;
public class IOU {
    HashMap <String,Double> debtList;
    
    public IOU(){
    this.debtList = new HashMap<>();
    
    }
    
    public void setSum(String toWhom, double amount){
        toWhom=stringClean(toWhom);
        if(doesContain(toWhom)){
            System.out.println("already on list");
        
        }else {this.debtList.put(toWhom,amount);}
        
        
        
        
    
        
    }
    public double howMuchDoIOweTo(String toWhom){
        toWhom=stringClean(toWhom);
        if(this.debtList.containsKey(toWhom)){
        return this.debtList.get(toWhom);}
        else{ return 0.0;}
    
    
    }
    /*
    public int timesSighted(String sighted) {
    if (this.allSightings.containsKey(sighted)) {
        return this.allSightings.get(sighted);
    }

    return 0;
}
    */
    
    public String stringClean(String dirtyString){
        dirtyString= dirtyString.toLowerCase();
        return dirtyString.trim();
        
    }
    
    public boolean doesContain(String word){
        if(this.debtList.containsKey(word)){
            return true;
        
        }else{return false;}
    
    }
    
}
