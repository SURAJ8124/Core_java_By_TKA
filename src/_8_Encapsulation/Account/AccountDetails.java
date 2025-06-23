package _8_Encapsulation;

public class AccountDetails {
    public static void main(String[] args){
        Account obj= new Account();
        obj.setAccNo(1);
        obj.setAccHldName("Suraj Chavan");
        obj.setAccBalance(4000);
        System.out.println(obj.getAccNo());
        System.out.println(obj.getAccHldName());
        System.out.println(obj.getAccBalance());


        BankAccount objBankAc= new BankAccount();
        objBankAc.setAccountNumber("104326897");
        objBankAc.setAccountHolderName("Anuj Kalind");
    }
}
