package _11_Abstraction.Interface.HomeWork.Question1;

public class sbiBank implements Bank{
    @Override
    public void makePayment() {
        System.out.println("You can make payments now");
    }

    public static void main(String[] args){
        sbiBank sb= new sbiBank();
        sb.makePayment();
    }
}
