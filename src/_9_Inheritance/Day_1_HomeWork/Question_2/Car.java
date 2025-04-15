package _9_Inheritance.Day_1_HomeWork.Question_2;

public class Car extends Vehicle{
    String carName;
     public void drive(){
         System.out.println(carName+" is start for drive.....");
     }
     public static void main(String[] args){
         Car obj = new Car();
         obj.carName="Swift";
         obj.modelName="Maruti Suzuki";
         obj.start();
         obj.drive();
     }
}
