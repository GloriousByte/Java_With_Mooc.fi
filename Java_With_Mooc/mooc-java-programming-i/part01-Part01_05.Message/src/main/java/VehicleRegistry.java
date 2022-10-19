import java.util.HashMap;
import java.util.ArrayList; 
public class VehicleRegistry {
        HashMap <LicensePlate,String> carsAndOwners;
    public VehicleRegistry(){
        this.carsAndOwners= new HashMap<>();
    
    
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(this.carsAndOwners.get(licensePlate)==null){
            this.carsAndOwners.put(licensePlate,owner);
            
            return true;
        }else{return false;}
        
           
        
    
    }
    public String get(LicensePlate licensePlate){
        return this.carsAndOwners.get(licensePlate);
    
    
    }
    public boolean remove(LicensePlate licensePlate){
         if(this.carsAndOwners.containsKey(licensePlate) && !(this.carsAndOwners.get(licensePlate)==null)){
             this.carsAndOwners.remove(licensePlate, this.carsAndOwners.get(licensePlate));
             return true;
         }else{return false;}
          
        }
    public void printLicensePlates(){
        ArrayList <LicensePlate> temp = new ArrayList<>();
        for(LicensePlate item : this.carsAndOwners.keySet()){
            temp.add(item);
        
        }
        for(LicensePlate item : temp){
            System.out.println(item);
        
        }
    
    }
    
     public void printLicensePlatesAndOwners(){
        
         
            for(LicensePlate item : this.carsAndOwners.keySet()){
            System.out.println(item + " "+ this.carsAndOwners.get(item));;
             
             }
         
         }
     
     }
   
    
    
}

/*
public ArrayList<Book> getBookByPart(String titlePart) {
    titlePart = sanitizedString(titlePart);

    ArrayList<Book> books = new ArrayList<>();

    for(String bookTitle : this.directory.keySet()) {
        if(!bookTitle.contains(titlePart)) {
            continue;
        }

        // if the key contains the given string
        // we retrieve the value related to it
        // and add it tot the set of books to be returned

        books.add(this.directory.get(bookTitle));
    }

    return books;
}



public ArrayList<Book> getBookByPart(String titlePart) {
    titlePart = sanitizedString(titlePart);

    ArrayList<Book> books = new ArrayList<>();

    for(Book book : this.directory.values()) {
        if(!book.getName().contains(titlePart)) {
            continue;
        }

        books.add(book);
    }

    return books;
}
*/
