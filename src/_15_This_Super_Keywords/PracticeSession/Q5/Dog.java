package _15_This_Super_Keywords.PracticeSession.Q2;

public class Dog extends Animal {
    Dog(){
        super();
        System.out.println("Dog is created.");
    }
    public static void main(String[] args){
        Dog d= new Dog();

    }
}
