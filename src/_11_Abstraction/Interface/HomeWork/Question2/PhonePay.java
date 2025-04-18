package _11_Abstraction.Interface.HomeWork.Question2;

public class PhonePay implements OnlinePayments{
    @Override
    public void makePayments() {
        System.out.println("The payment is done by phonePay");
    }
}
