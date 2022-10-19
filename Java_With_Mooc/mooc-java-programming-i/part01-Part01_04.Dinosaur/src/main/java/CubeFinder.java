/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class CubeFinder {
    int numberInput;
    
    public CubeFinder(int numberInput){
        this.numberInput=numberInput;
    }
    
    public int result(){
        int multi =0;
        int original = this.numberInput;
        while(multi<2){
            this.numberInput= this.numberInput * original;
            multi++;
        
        }
        return this.numberInput;
    }
}
