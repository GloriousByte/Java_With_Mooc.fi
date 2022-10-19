/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Where
 */
public class Debt {
    
    double balance;
    double interest;
    
    public Debt(double balanceInput,double interestInput){
        this.balance = balanceInput;
        this.interest=interestInput;
    
    }
    
    public void waitOneYear(){
        this.balance=this.balance*this.interest;
    }
    
    public void printBalance(){
        System.out.println(this.balance + "  is the current balance");
    }
}
