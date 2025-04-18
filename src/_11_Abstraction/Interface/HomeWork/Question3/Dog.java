package _11_Abstraction.Interface.HomeWork.Question3;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Bhow Bhow Bhow");
    }

    @Override
    public void color() {
        System.out.println(" My Color is black-white ");
    }

    Dog(){
        System.out.println("I am Dog.");
    }
}
