package Calculator;

public class Calculator {
    public static void main(String[] args){

        int a =30;
        int b=90;
        Addition objAdd= new Addition();
        objAdd.add(a, b);
        Division objDiv= new Division();
        objDiv.divide(a,b);
        Multiplication objMul= new Multiplication();
        objMul.multiplication(a, b);
        Substraction objSub= new Substraction();
        objSub.subtraction(a,b);
    }


}
