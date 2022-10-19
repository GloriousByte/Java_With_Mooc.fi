import java.util.Scanner;
public class AdaLovelace {

    public static void main(String[] args) {
        int holder;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ada Lovelace");
        int oldestAge=0;
        String oldestName="anony";
        int nameLength=0;
        String longestName="anony";
        int count=0;
        int sum=0;
        int avg;
        while(true){
            System.out.println("tell me a name and age");
            String input= scan.nextLine();
            
            if(input.equals("")){break;
            }else{String [] pieces = input.split(",");
                 if (pieces[0].length()>nameLength){
                     longestName=pieces[0];
                 
                 }
                 if(Integer.valueOf(pieces[1]) > oldestAge){
                 oldestAge=Integer.valueOf(pieces[1]);
                 oldestName=pieces[0];
            
            }
                 count++;
                 sum=sum+ Integer.valueOf(pieces[1]);
            }
            
            
        
        }
        avg= sum/count;
        System.out.println(oldestAge);
        System.out.println(oldestName);
        System.out.println("the longest name is "+ longestName);
        System.out.println("theh average age is " +avg );
        
        
        
        
     /*
        
                while(true){
            System.out.println("say something");
            String input = scan.nextLine();
            if(input.equals("")){
               break;
            }else{
                String [] pieces = input.split(" ");
                System.out.println("the first word is " +pieces[0]);
                int value=pieces.length-1;
                System.out.println("the last word is "+ pieces[value]);
                System.out.println(" ");
                
                for(int i=0;i<pieces.length;i++){
                    System.out.println(pieces[i]);
                    System.out.println(" ");
                }
                for(int i=0;i<pieces.length;i++){
                    
                    if(pieces[i].contains("av")){
                        System.out.println("the below word contains 'AV'");
                        System.out.println(pieces[i]);
                        System.out.println(" ");
                    
                    }
            
                  }
            
            }
            
        
        }
        System.out.println("you halted the programme");
        
        
        
        
        
        
        
        
        
        int [] numbers = new int [5];
        for(int i=0; i<numbers.length;i++){
            System.out.println("tell me a value");
            int input = Integer.valueOf(scan.nextLine());
            numbers[i] = input;
        
        }
        
        System.out.println(" below is original list");
        for(int i=0; i<5;i++){
            System.out.println(numbers[i]);
        
        }
        
        System.out.println(" ");
        
        System.out.println("which indices do you want to swap?");
        System.out.println("first number");
        int firstNo= Integer.valueOf(scan.nextLine());
        System.out.println("second number");
        int secondNo = Integer.valueOf(scan.nextLine());
        
        holder=numbers[firstNo];
        numbers[firstNo]=numbers[secondNo];
        numbers[secondNo]=holder;
        
        System.out.println(" ");
        System.out.println(" below is the new list");
        for(int i=0; i<5;i++){
            System.out.println(numbers[i]);
        
        }
        
        System.out.println("what number?");
        int findNo = Integer.valueOf(scan.nextLine());
        for(int i=0; i<5;i++){
            if(numbers[i]==findNo){
                System.out.println("I found "+ findNo + "at index " + i);
            };
        
        }
        int sumOfNumbers=sumOfNumbersInArray(numbers);
        System.out.println(sumOfNumbers);
        printNeatly(numbers);
        printInStars(numbers);
    }
    
    public static int sumOfNumbersInArray(int[] array){
        
        int sum=0;
        int i=0;
        while(i < array.length){
            sum= sum+array[i];
            i++;
        
        }
        
        return sum;
    
    
        }
    
    public static void printNeatly(int[] array){
        
        int lastItem=array.length-1;
        
        for(int i=0;i<array.length-1;i++){
                System.out.print(array[i]+ " ,");
            }
        System.out.println(array[lastItem]);
   
    
        }
     
    public static void printInStars(int [] array){
        
         for(int i=0;i<array.length;i++){
                int arrayValue=Integer.valueOf(array[i]);
                for(int j=0;j<arrayValue;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
         
         
         */
    }
     
     
}
