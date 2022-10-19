import java.util.HashMap;
import java.util.ArrayList;
public class DictionaryOfManyTranslations {
    HashMap<String,ArrayList<String>> dict;
    public DictionaryOfManyTranslations(){
        this.dict = new HashMap<>();
        
    
    }
    public void add(String word, String translation){
          //this.dict.putIfAbsent(word, new ArrayList<>());
          if(dict.containsKey(word)==false){
              dict.put(word,new ArrayList<>());
              dict.get(word).add(translation);
          
          }else{dict.get(word).add(translation);}
    
    
    }
    
    public ArrayList<String> translate(String word){
        ArrayList <String> meanings = this.dict.get(word);
        ArrayList<String> nothing= new ArrayList<>();
        if(!this.dict.containsKey(word)){
            return nothing;
        }
        if(this.dict.get(word).isEmpty()){
            return nothing;
        }else{return this.dict.get(word);}
        
    
    }
    public void remove(String word){
        this.dict.remove(word, this.dict.get(word));
    
    }
    
}
