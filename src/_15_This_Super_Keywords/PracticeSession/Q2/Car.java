package _15_This_Super_Keywords.PracticeSession;

public class Car {
    Car(){
        System.out.println("This is non parametrized constructor");
    }
    Car(int a, int b){
        this();
        System.out.println("This is Two parametrized constructor."+a+","+b);
    }
    Car(int a, int b, int c){
        this(a,b);
        System.out.println("This is Third parameterized constructor"+a+","+b+","+c);
    }

    public static void main(String[] args){
        Car c= new Car(9,6,9);
    }
}
