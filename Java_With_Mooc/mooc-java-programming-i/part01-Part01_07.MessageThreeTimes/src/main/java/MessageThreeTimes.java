
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
        

public class MessageThreeTimes {

   public static void main(String[] args) {
        ArrayList <Person> themAll = new ArrayList<>();
        Person Ama = new Person(" Ama","Love",1990);
        Person Joe = new Person ("Joe","Adjei",1980);
        Person Kweku = new Person("Kweku","Asamoah",2000);
        Person Lucy = new Person ("Lucy","oldie",1967);
        Person Mary = new Person ("Mary","Goldie",1966);
        themAll.add(Ama);
        themAll.add(Joe);
        themAll.add(Kweku);
        themAll.add(Lucy);
        themAll.add(Mary);
        
        long tellMe = themAll.stream()
                .filter(s -> s.getBirthYear() < 1970)
                .count();
   
        System.out.println("the count is "+ tellMe);
        long count = themAll.stream()
        .filter(person -> person.getFirstName().startsWith("L"))
        .count();
    System.out.println("Count: " + count);
    
    themAll.stream()
    .map(person -> person.getFirstName())
    .distinct()
    .sorted()
    .forEach(name -> System.out.println(name));

    }
        
}
