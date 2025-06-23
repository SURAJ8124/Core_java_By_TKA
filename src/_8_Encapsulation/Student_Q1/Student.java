package _8_Encapsulation;

public class Student {
    private String sName;
    private char sDiv;
    private String sStd;
    private int sRollNo;
    private String sHobby;
    private String sAddress;
    private int sMarks;

    public int getMarks(){
        return sMarks;
    }
    public void setMarks(int marks){
        this.sMarks=marks;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public char getsDiv() {
        return sDiv;
    }

    public void setsDiv(char sDiv) {
        this.sDiv = sDiv;
    }

    public String getsHobby() {
        return sHobby;
    }

    public void setsHobby(String sHobby) {
        this.sHobby = sHobby;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsRollNo() {
        return sRollNo;
    }

    public void setsRollNo(int sRollNo) {
        this.sRollNo = sRollNo;
    }

    public String getsStd() {
        return sStd;
    }

    public void setsStd(String sStd) {
        this.sStd = sStd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                ", sRollNo=" + sRollNo +
                ", sDiv='" + sDiv + '\'' +
                ", sHobby='" + sHobby + '\'' +
                ", sMarks=" +  sMarks +'\''  +
                ", sStd='" + sStd + '\'' +
                '}';
    }
}
