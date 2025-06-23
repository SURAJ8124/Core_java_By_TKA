package _15_This_Super_Keywords.PracticeSession;

public class Student {
    String name;
    int age;

     Student(int age, String name) {
        this.name = name;
         this.age = age;
         System.out.println("Name:"+name);
         System.out.println("Age:"+age);
    }
    public static void main(String[] args){
         Student s= new Student(21,"Elvish");
    }

}
