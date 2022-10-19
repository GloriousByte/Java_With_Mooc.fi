import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class OnceUponATime {

    public static void main(String[] args) {
    
        int[] numbers = {6, 5, 8, 7, 11};
        Smallest first = new Smallest(numbers);
        first.findTiny();
      
        


    
    }
}
           



       /* 



ift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift car = new Gift("hyundai", 8);
        Gift computer = new Gift("del laptop", 4);
        Gift door = new Gift("door", 4);

        Package gifts = new Package();
        Package assignments = new Package();
        assignments.addGift(door);
        gifts.addGift(book);
        gifts.addGift(car);
        gifts.addGift(computer);
        System.out.println(gifts.totalWeight());
        System.out.println("this is the heaviest " +gifts.getHeaviest());
        
        GiftTruck hold = new GiftTruck();
        hold.addPackage(gifts);
        hold.addPackage(assignments);
        System.out.println(hold);
         Scanner scan = new Scanner(System.in);
        ArrayList <Archive> archive = new ArrayList<>();
        while(true){
            System.out.println("enter an identifier. 0 exists");
            String input = scan.nextLine();
            if(input.equals("0")){break;
               }else{
                    System.out.println("enter a name");
                    String secondInput = scan.nextLine();
                    Archive select = new Archive(input,secondInput);
                    if(archive.contains(select)){
                        continue;
                    
                    }else{archive.add(select);}
                    
                   

            
        
        
        }
        }
        System.out.println("I have broken");
        
        for(Archive turn : archive){System.out.println(turn);}
        System.out.println("after for loop");
        System.out.println(archive.size());
        
        ClockHand hour = new ClockHand(24);
        ClockHand minute = new ClockHand(60);
        ClockHand second = new ClockHand(60);
        
        while(true){
            System.out.println(hour+ " " + minute +" "+ second );
            second.advance();
            if (second.getValue()==0){
                minute.advance();
                 if(minute.getValue()== 0){
            
                    hour.advance();
            }
            
            }
           
            
        
        
        }
        
        
        
           System.out.println("what file do you want top read from?");
        String choiceFile = scan.nextLine();
        try(Scanner read = new Scanner(Paths.get(choiceFile))){
            while(read.hasNextLine()){
                teams.add(read.nextLine());
                
            
            }
            System.out.println("which team are you looking for");
            String choiceTeam = scan.nextLine();
            int gamesPlayed= 0;
            int wins=0;
            int losses=0;
            for(String team : teams){
               
                
               
                if(team.contains(choiceTeam)){
                    
               
                  
                    gamesPlayed++;
                    String [] parts = (team.split(","));
                  
                  
                    int i=2; 
                    if(parts[0].equals(choiceTeam)){
                        if(Integer.valueOf(parts[i])>Integer.valueOf(parts[i+1])){
                          wins++;
                            
                        
                        }else{losses++;}
                    
                    }else if(parts[1].equals(choiceTeam) ){
                        
                        if(Integer.valueOf(parts[i+1])>Integer.valueOf(parts[i])){
                          wins++;
                            
                        
                        }else{losses++;}
                    
                    }else{System.out.println("we would never get here");}
                   
                }
         
                
            
            
            
            }
            if (gamesPlayed ==0){System.out.println("team not found");}
            System.out.println(choiceTeam + "has played " + gamesPlayed + "games");
            System.out.println("has won "+ wins);
            System.out.println("has lost "+ losses);
                
            
            
        
        }
        catch(Exception e){}
       
         System.out.println("I am running");
        ArrayList<Dog> manyDogs = new ArrayList<>();
        ReadRecords school = new ReadRecords("attendance");
        manyDogs = school.readRecordsFromFile("csvstuff.txt");
        for(Dog many : manyDogs ){System.out.println(many);}
        Scanner scan = new Scanner(System.in);
        System.out.println("what file do you want to read from?");
        String fileChoice = scan.nextLine();
        try(Scanner scanner = new Scanner(Paths.get(fileChoice))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                String [] pieces = row.split(",");
                System.out.println(pieces[0] +" age: " + pieces[1] +" years");
            
            }
        
        
        }
        catch(Exception e){}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        
         Scanner scan = new Scanner(System.in);
           ArrayList <String> guests = new ArrayList<>(); 
           ArrayList <Integer> numbers = new ArrayList<>(); 
           
       
      
           System.out.println("enter the name of a text file");
           String input = scan.nextLine();
           System.out.println("small number");
           String small = scan.nextLine();
           System.out.println("big number");
           String big = scan.nextLine();
           try(Scanner scanner = new Scanner(Paths.get(input))){
               while(scanner.hasNextLine()){
                   String row = scanner.nextLine();
                   System.out.println(row);
                   numbers.add(Integer.valueOf(row));
                   
                  
               }
               for(int number : numbers){System.out.println(number + " is in list");}
              
               for(int i=0;i<numbers.size();i++){
                   System.out.println(" ");
                   System.out.println("for loop stage");
                   System.out.println(" ");
               
                   if (numbers.get(i)>=Integer.valueOf(small) && numbers.get(i)<=Integer.valueOf(big)){
                       System.out.println(numbers.get(i) +"is within range");
                   
                   }
               }
              
           
            }
           catch(Exception e){ System.out.println("Error: " + e.getMessage());}
           
        }*/
          
       
       
       

     
   /* Dog whitey = new Dog("Adjei",67);
        Dog blackey = new Dog("suarez",90);
        whitey.tellAge();
        whitey.printName();
        whitey.growOlder(100);
        whitey.growOlder(50);
        blackey.growOlder(0);
        whitey.tellAge();
        blackey.tellAge();
        
        
        Door wood = new Door();
        wood.knock();int maxAge;
        PaymentCard card = new PaymentCard(10);
        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);
        String name ="happyman";
        Scanner scan = new Scanner(System.in);
        ArrayList <Dog> manyDogs= new ArrayList<>();
        System.out.println("enter a max age");
        maxAge=Integer.valueOf(scan.nextLine());
        while(true){
          
            System.out.println("enter a dog's name and age");
            String input= scan.nextLine();
            if(input.equals("")){break;
            }else{
            String[] pieces=input.split(",");
            int age =Integer.valueOf(pieces[1]);
            manyDogs.add(new Dog(pieces[0],age));
            }
        
        }
        for(Dog dog:manyDogs){System.out.println(dog);}
        for(Dog dog:manyDogs){
            if (dog.getAge()<=maxAge){
                System.out.println("dog "+dog.getName() + " is " +dog.getAge() + " years");
            }
        
        }
        System.out.println("what do you want both name and age/just age?");
        String input = scan.nextLine();
        if(input.equals("everything")){
           for(Dog dog:manyDogs){System.out.println(dog.getName() + " and " +dog.getAge());}
        
        }
        if(input.equals("name")){
           for(Dog dog:manyDogs){System.out.println(dog.getName());}
        
        }
        System.out.println("doonnneeee!!1");*/
    

