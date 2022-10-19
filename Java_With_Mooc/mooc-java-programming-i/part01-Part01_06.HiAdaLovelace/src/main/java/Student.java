/*
Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
System.out.println(ollie);
System.out.println("Study credits " + ollie.credits());
ollie.study();
System.out.println("Study credits "+ ollie.credits());

Sample output

Ollie
  6381 Hollywood Blvd. Los Angeles 90028
Study credits 0
Study credits 1
re
 */
public class Student extends Person {
    int credits;
    
    public Student(String name,String address){
        super(name,address);
        this.credits=0;
        
        
    
    }
    public void study (){
        this.credits ++;
    
    }
    
    public int credits(){
        return this.credits;
    }
    
    public String toString(){
        return name + "\n" + " " + address+ "\n study credits: " + this.credits ;
    
    }
    
    
    
    
    
    
}
