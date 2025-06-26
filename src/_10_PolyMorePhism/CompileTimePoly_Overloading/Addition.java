package _10_PolyMorePhism.CompileTimePoly;

public class Addition {

    public void add(int a, int  b){
        System.out.println("The addition of integer value: "+(a+b));
    }
    public void add(double a, double b, double c){
        System.out.println("The addition of double value: "+(a+b));
    }
    public static void main(String[] args){
        Addition ad= new Addition();
        ad.add(34, 89);
        ad.add(34.8,89.6,34.6);
        
    }
}
