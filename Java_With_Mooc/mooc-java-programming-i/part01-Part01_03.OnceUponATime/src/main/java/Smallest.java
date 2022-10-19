import java.util.ArrayList;
public class Smallest {
    int[] small;
    int tiny;
    int tinyIndex;
    
    public Smallest(int[]small){
        this.small = small;
        
    
    }
    
    public void findTiny(){
        tiny=small[0];
        for(int i=0;i<small.length;i++){
            int item=small[i];
            if(item<tiny){
                tiny=item;
                tinyIndex=i;
                
            }
            
           
        }
 
        System.out.println("the smallest is " + tiny+ " and it's index is "+ tinyIndex ");  
    }
    
    
    
}
