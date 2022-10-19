/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class Hospital {
    private String name;
    private int weighings;
    
    
    public Hospital(String name){
        this.name=name;
    }
    
    public void weight (Patient patient){
        System.out.println( patient.name() +" weighs " +patient.weight());
        weighings++;
        System.out.println(weighings+ " have checked their weight ");
    }
    
    
    public void feed (Patient patient){
        int mass=10;
        patient.changeWeight(mass);
        System.out.println( patient.name() +" now weighs " + patient.weight() +"pounds");
    }
}
