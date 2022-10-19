import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if(this.meals.contains(meal)){
            System.out.println(meal + " is already in");
           
        }else{this.meals.add(meal);
            System.out.println(meal + " was added");
        
        }
        
    }
    
    public void printMeals(){
        for(String food : this.meals){
        
            System.out.println(food);
        }
    
    }
    public void clearMenu(){
    
        for(int i=0;i<=this.meals.size();i++){
            this.meals.remove(this.meals.get(0));
       
            
        }
    
    }
    
}