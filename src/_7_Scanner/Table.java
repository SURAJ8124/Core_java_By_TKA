package _7_Scanner;

import java.util.Scanner;

public class Table {
    public static void table(int a){
         for (int i=1; i<=10; i++){
             int c= a*i;
             System.out.println(c);
         }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int value= sc.nextInt();

        table(value);
    }
}
