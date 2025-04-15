package _9_Inheritance;

public class Marks extends Students{
    int subject1;
    int subject2;

    public int calculateTotal(){
        int c= subject1+subject2;
        return c;
    }

    public Marks(int subject1, int subject2) {
        this.subject1 = subject1;
        this.subject2 = subject2;
    }
    public static void main(String[] args)
    {
        Marks obj= new Marks(56, 89);
        obj.name="Suraj";
        obj.rollNo=20;
        System.out.println("The marks is "+obj.calculateTotal());


    }
}
