/*

 */
public class Book implements Packable {
    String name;
    String author;
    double weight;
    
    public Book(String author,String name,double weight){
        this.name=name;
        this.author=author;
        this.weight=weight;
    
    }
    public String toString(){
        return this.author + " : " + this.name;
    
    }
    
    public double weight(){
        return this.weight;
    
    }
}
