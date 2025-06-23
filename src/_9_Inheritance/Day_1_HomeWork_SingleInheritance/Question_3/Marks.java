package _9_Inheritance.Day_1_HomeWork.Question_3;

//Create a class Student with fields name, rollNo.
// Inherit a class Marks with fields subject1, subject2, and method to calculate total.
// Display all details using a Marks class object.
public class Marks extends Student{
    int subject1;
    int subject2;

   public void calculate(){
       System.out.println("Total marks : " +(subject1 + subject2)+" out of 200 ");
   }

   public static void main(String[] args){
       Marks m= new Marks();
       m.name="Rohini";
       m.rollNo=03;
       m.subject2=34;
       m.subject2=89;
       m.calculate();
   }
}
