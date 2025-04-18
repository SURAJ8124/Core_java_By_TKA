package _11_Abstraction.Interface.HomeWork.Question2;

public class Main {
    public static void main(String[] args){
        GooglePay gPay= new GooglePay();
        gPay.makePayments();
        System.out.println("-------------------------------");
        PhonePay pPay= new PhonePay();
        pPay.makePayments();

    }
}
