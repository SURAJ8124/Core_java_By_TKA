package _7_Scanner;

import java.util.Scanner;

public class EvenOdd {
    public static void evenOdd(int a){
         if((a%2)==0){
             System.out.println("The integer "+a+" is even");
         }
         else {
             System.out.println("The integer "+a+" is Odd");
         }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value");
        int value= sc.nextInt();
        evenOdd(value);
        sc.close();
    }
}
