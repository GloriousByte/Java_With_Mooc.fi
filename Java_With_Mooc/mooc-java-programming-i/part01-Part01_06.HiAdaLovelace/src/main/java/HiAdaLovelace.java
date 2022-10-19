import java.util.ArrayList;
public class HiAdaLovelace {

    public static void main(String[] args) {
        
        
        
        ShoppingClass cart = new ShoppingClass();
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("buttermilk", 2);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");


    }

}
/*
        ArrayList <Person> fellows = new ArrayList<>();
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
        
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);
        
        Teacher kofi = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher ama = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(kofi);
        System.out.println(ama);

        Student bola = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
          ollie.study();
          i = i + 1;
        }
        System.out.println(bola);
        fellows.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        fellows.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(fellows);
        Person boom = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
                     // DOESN'T WORK!
        System.out.println(boom);   // ollie.toString() WORKS
 


    }
    
    public static void printPersons(ArrayList<Person> persons){
            for(Person human : persons){
                System.out.println(human);





*/