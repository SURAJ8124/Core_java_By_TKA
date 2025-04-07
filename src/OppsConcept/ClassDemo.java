package OppsConcept;

public class ClassDemo {
    public void m1(){
        System.out.println("This is non-static method");
    }
    public static void main(String[] args){
        ClassDemo d = new ClassDemo();
        d.m1();
    }
}
