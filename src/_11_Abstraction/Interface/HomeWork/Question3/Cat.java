package _11_Abstraction.Interface.HomeWork.Question3;

public class Cat implements Animal{
    @Override
    public void color() {
        System.out.println("My color is white.");
    }

    @Override
    public void sound() {
        System.out.println("Meow Meow Meow");
    }
    Cat(){
        System.out.println("I am Cat");
    }
}
