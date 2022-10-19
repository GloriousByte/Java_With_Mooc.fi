/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class Clock {
    ClockHand seconds;
    ClockHand minutes;
    ClockHand hours;

    
    public Clock(){
    
        this.seconds= new ClockHand(60);
        this.minutes = new ClockHand(60);
        this.hours = new ClockHand(24);
       
        
        
    }
    
    public void advance() {
        this.seconds.advance();

        if (this.seconds.getValue() == 0) {
            this.minutes.advance();

            if (this.minutes.getValue() == 0) {
                this.hours.advance();
            }
        }
    }
    
    public String toString(){
    
        return hours + ":" + minutes + ":"+ seconds;
    }
    
    
}
