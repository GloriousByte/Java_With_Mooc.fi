import java.util.Scanner;
import java.util.ArrayList;
public class Sandbox {

    public static void main(String[] args) {
        while(true){
            System.out.println("charging");
        }
        

       
     }
    
    
}
       
       /* 


        ArrayList <String> fruits = new ArrayList<>();
        ArrayList <Integer> values = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int number = 32;
        
         while(true){
            System.out.println("input a number");
            int input = Integer.valueOf(scan.nextLine());
            if(input==-1){
                break;
            }else{
                values.add(input);
              
            }
        }
        printNumbersInRange(values,2,10);
        System.out.println(" ");
        System.out.println("range method");
        removeFirstAndLast(values);
        System.out.println(" ");
        System.out.println("remove method is running ");
        for(int item: values){
            System.out.println("the number is " + item);
        }
        System.out.println("the above is the list condition after removal function");
        
        increaseNumber(number);
        System.out.println("original value didn't change. Still "+ number);
     
    } 
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){ 
        
         
         for(int i =0; i<numbers.size();i++){
         
             if(numbers.get(i)>= lowerLimit && numbers.get(i)<= upperLimit){
                 
                 System.out.println("the umber" + numbers.get(i) + " is in range");
             }
         
         }
         
    }
    
    public static void removeFirstAndLast(ArrayList<Integer> numbers){
        numbers.remove(0);
        numbers.remove(numbers.size()-1);
    
    }
     public static void increaseNumber(int number){
        int value=number+200;
        System.out.println("method increased number to "+ value);
        
        
        while(true){
            System.out.println("enter a string");
            String input= scan.nextLine();
            if(input.equals(" ")){
                break;
            
            }else fruits.add(input);
        
        }
        System.out.println("search for?");
        String searchWord = scan.nextLine();
        for(int i=0;i<fruits.size();i++){
        
            if(fruits.get(i).equals(searchWord)){
                System.out.println("word found at index  " +i);
            
            }
        }
        
           
        int counter=0;
        int largest =0;
        int base;
        int sum=0;
        int avg;
        int devisor;
        System.out.println("enter base number");
        int baseNumber = Integer.valueOf(scan.nextLine());
        System.out.println("enter max");
        int roofNumber= Integer.valueOf(scan.nextLine());
        
        while(true){
            System.out.println("input a number");
            int input = Integer.valueOf(scan.nextLine());
            if(input==-1){
                break;
            }else{
                values.add(input);
                sum=sum+input;
                
            }
        }
        
        for(int i= 0; i<values.size();i++){
            if (values.get(i)>=baseNumber && values.get(i)<=roofNumber){
                System.out.println("index " + i + "is within range. value is " + values.get(i));
                
             }
        }
        
        for(int i=0;i<values.size();i++){
            if(values.get(i)>largest){
                largest=values.get(i);
            }
            
            
        
            }
        System.out.println("the largest number is " +largest);
        System.out.println("what number are you looking for?");     
        int requestedNo = Integer.valueOf(scan.nextLine());
        for (int i=0; i<values.size();i++){
            if(values.get(i)== requestedNo){
                System.out.println("the number "+ requestedNo+ " is at index "+ i);
            }
        
        }
        base= values.get(0);
        for(int i =0;i<values.size();i++){
            
            if(values.get(i)<base){
                base= values.get(i);
            }
        
        }
        
        for (int i=0; i<values.size();i++){
            if(values.get(i)== base){
                System.out.println("the smallest number is at "+ i);
            }
        
        }
        
        System.out.println("the smallest number is " + base);
        System.out.println("the average is  "+sum/values.size());
        

         while(true){
            System.out.println("enter a value. 0 exists");
            int input = Integer.valueOf(scan.nextLine());
            if(input==0){break;
            
            }else{
            values.add(input);
            
            }
        }
        
        for (int i=0;i<values.size();i++){
            System.out.println("index " + i + " is " +values.get(i));
            
        
        }






            while(true){
            System.out.println("tell me a fruit");
            String input = scan.nextLine();
            
            if(input.equals("exit")){
                break;
            }
            fruits.add(input);
        
        }
        System.out.println("the number of fruits is : " +fruits.size());
        
        
        
        while(counter<fruits.size()){
            System.out.println("number " + counter+ " is " + fruits.get(counter) );
            counter++;
        }
        
        System.out.println("the above is the while loop version ");
        for(int i=0;i<fruits.size();i++){
            
            System.out.println("numner " + i + " is " + fruits.get(i));
        
        
        }
        System.out.println("the above used a for loop");
        System.out.println(fruits.get(fruits.size()-1));
    }
        
        
    
       Scanner scan = new Scanner(System.in);
        System.out.println("width");
        int input = Integer.valueOf(scan.nextLine());
        System.out.println("height");
        int inputB = Integer.valueOf(scan.nextLine());
     
        printStars(input);
        System.out.println(" ");
        System.out.println("the above is the printStars function\n");
        
        printTriangle(input);
        System.out.println(" ");
        System.out.println("the above is for the triangle");
        
        christmasTree(input);
        System.out.println(" ");
        System.out.println("the above is for christmas tree");
      
        
        
          
}
    public static void printStars(int number){
         for(int i=0; i<number; i++){
             System.out.print(" ");
           
         }
        
   
}
    public static void printStarsReal(int number){
         for(int i=0; i<number; i++){
             System.out.print("*");
           
         }
        
   
}
    
    public static void printSquares(int number){
        for(int i=0; i<number;i++){
            printStars(number);
        }
    }
    
    public static void printRectangle(int A, int B){
  
       for(int i=0; i<B;i++){
                printStarsReal(A);
                System.out.println(" ");
       }
        
    }
    
    
    public static void printTriangle(int size){
        for(int i=1;i<=size;i++){
            
            printStars(size-i);
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
    public static void christmasTree(int height){
            
        for(int i=1;i<=height;i++){
            
            printStars(height-i);
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
                
            }
            printStars(height-(i-1));
            System.out.println(" ");
        }   
            
            System.out.println("below is the base");
            for(int i=0; i<2; i++){
            printStars(height-2);
            printStarsReal(3);
            System.out.println(" ");
            
            }
    }
        
 */   
    
    
    
    

