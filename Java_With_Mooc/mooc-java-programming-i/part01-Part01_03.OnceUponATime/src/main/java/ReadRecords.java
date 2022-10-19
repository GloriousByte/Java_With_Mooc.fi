/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
public class ReadRecords {
    String recordName;
    
    public ReadRecords(String name){
        this.recordName=name;
    
    }
    public static ArrayList<Dog> readRecordsFromFile(String file){
        
        ArrayList <Dog> manyDogs = new ArrayList<>();
        try(Scanner scan = new Scanner(Paths.get(file))){
        
            while(scan.hasNextLine()){
                  String row = scan.nextLine();
                  String [] pieces =row.split(",");
                  Dog bull = new Dog(pieces[0],Integer.valueOf(pieces[1]));
                  manyDogs.add(bull);
                
                
            
            }
        }
        catch(Exception e){
            System.out.println("meh");
        
        }
        
        return manyDogs;
    
    }
}
