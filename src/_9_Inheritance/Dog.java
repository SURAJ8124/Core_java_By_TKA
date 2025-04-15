package _9_Inheritance;

public class Dog extends Animal {
    String name;
    public void bark(){
        System.out.println(name+" is started bark");
    }


    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        Dog obj= new Dog();
        obj.setName("Jack");
        obj.bark();
        obj.eat();


    }
}
