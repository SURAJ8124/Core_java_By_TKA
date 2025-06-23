package _8_Encapsulation;

public class Account {
  private   int accNo;
   private String accHldName;
   private double accBalance;

    public double getAccBalance() {
        return accBalance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccHldName() {
        return accHldName;
    }

    public void setAccHldName(String accHldName) {
        this.accHldName = accHldName;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }
}
