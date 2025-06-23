package _8_Encapsulation;

public class StudentDetails {
    public static void main(String[] ars){
        Student obj= new Student();
        obj.setsName("Ronny Sharma");
        obj.setsHobby("Cricket");
        obj.setsAddress("Baner, Pune, Maharashtra 411033");
        obj.setsRollNo(39);
        obj.setsDiv('A');
        obj.setsStd("6th");
        obj.setMarks(90);
     System.out.println(obj.toString());
    }
}
