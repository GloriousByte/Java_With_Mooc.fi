
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("value of gift");
        double taxToPay;
        int input = Integer.valueOf(scan.nextLine());
        if(input<5000){
            System.out.println("no tax");
        }
        if(input >=5000 && input < 25000){
            taxToPay=  100 + (input-5000)*0.08;
            System.out.println(taxToPay);
        }else if(input >=25000 && input <=55000){
            taxToPay=  1700 + (input-25000)*0.10;
            System.out.println(taxToPay);
        }else if(input >=55000 && input <=200000){
            taxToPay=  4700 + (input-55000)*0.12;
            System.out.println(taxToPay);
        }else if(input >=200000 && input <=1000000){
            taxToPay=  22100 + (input-200000)*0.15;
            System.out.println(taxToPay);
        }else if(input >=1000000){
            taxToPay=  142100 + (input-1000000)*0.17;
            System.out.println(taxToPay);
        }
    }
}

