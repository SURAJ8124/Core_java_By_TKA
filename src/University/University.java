package University;

public class University {
    String universityName;
    String location;
    int numStudents;
    int numPrfessors;
    int ranking;
    String foundingYear;
    String department;
    String graduationLevel;

    public static void main(String[] arga){
        University obj= new University();
        System.out.println(obj.universityName="Sppu");
        System.out.println(obj.department="Computer");
        System.out.println(obj.foundingYear="1990");
        System.out.println( obj.graduationLevel="B.E");
        System.out.println( obj.location="Pune");
        System.out.println(obj.numPrfessors=1000);
        System.out.println(obj.ranking=12);
       System.out.println( obj.numStudents=100000000);


    }

}
