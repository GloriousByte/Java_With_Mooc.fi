import java.util.HashMap;
import java.util.ArrayList;
public class StorageFacility {
    
     HashMap<String,ArrayList<String>> records;
     
     public StorageFacility(){
          this.records = new HashMap<>();
        
     
     }
     
     public void add(String unit, String item){
         this.records.putIfAbsent(unit, new ArrayList<>());
         this.records.get(unit).add(item);
         
     
     }
     public ArrayList<String> contents(String storageUnit){
            ArrayList <String> meanings = this.records.get(storageUnit);
            ArrayList<String> nothing= new ArrayList<>();
            if(!this.records.containsKey(storageUnit)){
                return nothing;
            }
            if(this.records.get(storageUnit).isEmpty()){
                return nothing;
            }else{return this.records.get(storageUnit);}
     }
            
    public void remove(String storageUnit, String item){
        
           ArrayList <String> temp = new ArrayList<>(); 
           temp = this.records.get(storageUnit);
           String catcher = "not yet";
           int i=0;
           int holder=0;
           while(catcher.equals("not yet")){
               
              
               if(temp.get(i).equals(item)){
                    catcher=item;
                    holder = i;
                    break;
                   
               
               }else{i++;
               continue;
               
               }
               
           
           }
           temp.remove(holder);
           if(temp.isEmpty()){
               this.records.remove(storageUnit,temp);
           
           
           }
           
           
           
    
       
       }   
     

     public ArrayList<String> storageUnits(){
           
        ArrayList <String>temp = new ArrayList<>();
        for(String item : this.records.keySet()){
            if(!this.records.get(item).isEmpty()){
            temp.add(item);
            }else{continue;}
        
        }
        return temp;
       
        
        
     }            
         
         
        
     
     
     
    
    
}
