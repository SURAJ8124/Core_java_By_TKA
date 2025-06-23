package _9_Inheritance.Day_1_HomeWork.Question_1;

//Create a class Animal with a method eat().
// Inherit a class Dog that has a method bark().
// Call both methods from the Dog class object.

public class Dog extends Animal{
    String name;


    public void bark(){
        System.out.println(name+" start Bow Bow ");
    }
    public static void main(String[] args){
        Dog obj= new Dog();
        obj.name="Sheru";
        obj.food= "Chappati";
        obj.bark();
        obj.eat();

    }
}
