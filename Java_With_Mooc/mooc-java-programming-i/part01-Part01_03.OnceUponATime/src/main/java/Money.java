public class Money {

    private final int cedis;
    private final int pesewas;

    public Money(int cedis, int pesewas) {
       
     
        this.cedis=cedis;
        
        this.pesewas=pesewas;
        
        
            
        
        
 }

    public int cedis() {
        return cedis;
    }

    public int pesewas() {
        return pesewas;
    }

    public String toString() {
       
        return cedis + "."  + pesewas + "ghc";
    }
    
    public Money plus(Money addition) {
        int eurosTotal= this.cedis+addition.cedis();
        int centsTotal = this.pesewas+addition.pesewas();
        if(centsTotal==100){
            eurosTotal++;
            centsTotal=0;
            Money newMoney = new Money(eurosTotal,centsTotal);

        return newMoney;
        }else if(centsTotal>100){
            int diff= centsTotal-100;
            eurosTotal++;
            centsTotal=diff;
            Money newMoney = new Money(eurosTotal,centsTotal);

            return newMoney;
            
        
        }else{
        Money newMoney = new Money(eurosTotal,centsTotal);

        return newMoney;}
}
   /* public Money minus(Money decreaser){
        int newCedis= this.cedis-decreaser.cedis();
        int newPesewas = this.pesewas-decreaser.pesewas();
        if(newPesewas<0){
            int offMark=(newPesewas*-1)*;
            newCedis=newCedis-o
            
        
        }
        
        
    
    
    }*/
  
}