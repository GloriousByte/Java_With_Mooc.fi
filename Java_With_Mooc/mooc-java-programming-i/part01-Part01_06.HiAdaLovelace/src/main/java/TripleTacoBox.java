/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class TripleTacoBox implements TacoBox{
     int tacos;

    public TripleTacoBox(int tacos) {
        this.tacos = tacos;
   
    }

    public int tacosRemaining() {
        return 7;
    }
    public void eat(){}

}
