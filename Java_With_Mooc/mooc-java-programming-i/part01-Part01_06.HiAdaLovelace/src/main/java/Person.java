/*
Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
System.out.println(ada);
System.out.println(esko);

Sample output

Ada Lovelace
  24 Maddox St. London W1S 2QN
Esko Ukkonen
  Mannerheimintie 15 00100 Helsinki


*/

public class Person {
    String name;
    String address;
    
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    
    }
    
    public String toString(){
        return name + "\n" + " " + address;
    
    }
    
}
