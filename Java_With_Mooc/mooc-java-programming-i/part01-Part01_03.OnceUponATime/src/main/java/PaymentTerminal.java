public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money=1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >=2.50){
            double change=payment-2.50;
            this.money=this.money+2.50;
            this.affordableMeals++;
            return change;
        
        }else{System.out.println("money wasn't enough");
               return payment;}
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >=2.50){
            double change=payment-4.30;
            this.money=this.money+4.30;
            this.heartyMeals++;
            return change;
        
        }else{System.out.println("money wasn't enough take back your "+ payment);
               return payment;}
    }

    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double balance= card.balance();
        if (balance>=2.50){
        
            boolean feedback=card.takeMoney(2.50);
            return feedback;
        }else{System.out.println("you are broke");return false;}
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
         double balance= card.balance();
        if (balance>=2.50){
        
            boolean feedback=card.takeMoney(4.30);
            return feedback;
        }else{System.out.println("you are broke");return false;}
    }
    
    
    
    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}