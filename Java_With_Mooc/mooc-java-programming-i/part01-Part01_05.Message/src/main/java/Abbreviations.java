import java.util.HashMap;
public class Abbreviations {
    HashMap <String,String> abbrev ;
    
    public Abbreviations(){
        this.abbrev = new HashMap<>();
    
    
    }
    public String stringClean(String input){
        input = input.toLowerCase();
        return input.trim();
    
    }
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviation=stringClean(abbreviation);
        if(this.abbrev.containsKey(abbreviation)){
            System.out.println("already in");
        }else{
           this.abbrev.put(abbreviation,explanation);
        }
    
    }
    public boolean hasAbbreviation(String abbreviation){
         abbreviation=stringClean(abbreviation);
          if(this.abbrev.containsKey(abbreviation)){
              return true;
        }else {return false;}
        
    
    }
    public String findExplanationFor(String abbreviation) {
         abbreviation=stringClean(abbreviation);
         if(this.abbrev.containsKey(abbreviation)){
             return abbrev.get(abbreviation);
         
         }else{return "not available";}
         
    
    
    }
    
}
