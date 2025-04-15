package _9_Inheritance.Day_1_HomeWork.Question_1;

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
