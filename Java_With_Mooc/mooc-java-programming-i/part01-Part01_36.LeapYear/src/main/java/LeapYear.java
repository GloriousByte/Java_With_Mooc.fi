
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int input = Integer.valueOf(scan.nextLine());
        if(input%100==0 && input%400==0 ){
            System.out.println("is a leap year");
        }else if(input %100 ==0 && input % 400>0){
            System.out.println("is not a leap year");
        } else if ( input%4 ==0){
            System.out.println("is a leap year");
        }else{
            System.out.println("is not a leap year");
        }
    }
}