package _8_Encapsulation;

public class EmployeeDetails {
    public static void main(String[] args){
        Employee obj= new Employee();
        obj.setEmpId(21);
        obj.setEmpAddress("Wakad Road, PCMC, PUNE 411057");
        obj.setEmpDesignation("Senior Software Engineer");
        obj.setEmpExperience("5ys");
        obj.setEmpSalary(20000);
        obj.setEmpMobileNo("8909675437");
        obj.setEmpName("Akash Jadhav");
        System.out.println(obj.toString());

    }


}
