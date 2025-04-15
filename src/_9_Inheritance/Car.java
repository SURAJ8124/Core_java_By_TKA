package _9_Inheritance;

public class Car extends Vehicle {
    String name;
    public void drive(){
        System.out.println(name+" is available for drive.");
    }



    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args){
        Car obj=new Car();
        obj.setName("Mini Cooper");
        obj.start();
        obj.drive();
    }
}
