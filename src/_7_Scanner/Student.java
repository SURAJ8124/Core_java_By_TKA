package _7_Scanner;

import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Student name");
        String sName=sc.nextLine();
        System.out.println("Enter the student age");
        int age= sc.nextInt();
        System.out.println("Enter the student class");
        char div= sc.next().charAt(0);
        System.out.println("Enter the student Roll No.");
        int rollNumber= sc.nextInt();
        System.out.println("Enter the student height");
        double height= sc.nextDouble();
        System.out.println("Student name:"+sName);
        System.out.println("Student age:"+age);
        System.out.println("Student div:"+div);
        System.out.println("Student rollNumber:"+rollNumber);
        System.out.println("Student height:"+height);



    }
}
