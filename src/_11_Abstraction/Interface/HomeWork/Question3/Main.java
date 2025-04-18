package _11_Abstraction.Interface.HomeWork.Question3;

public class Main {
    public static void main(String[] args){
        System.out.println("--------------------------------");
        Cat cat=new Cat();
        cat.color();
        cat.sound();
        System.out.println("--------------------------------");
        Dog dog= new Dog();
        dog.color();
        dog.sound();
        System.out.println("--------------------------------");
        Cow cow= new Cow();
        cow.color();
        cow.sound();
        System.out.println("--------------------------------");
    }
}
