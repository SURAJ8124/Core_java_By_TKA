package _8_Encapsulation;

public class Employee {
    private int empId;
    private String empName;
    private int empSalary;
    private String empMobileNo;
    private String empAddress;
    private String empExperience;
    private String empDesignation;

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
        if(empSalary<=10000) {
            System.out.println("Employee Salary is low ");
        }
        else {
            System.out.println("Employee Salary is in the range");
        }
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpExperience() {
        return empExperience;
    }

    public void setEmpExperience(String empExperience) {
        this.empExperience = empExperience;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpMobileNo() {
        return empMobileNo;
    }

    public void setEmpMobileNo(String empMobileNo) {
        this.empMobileNo = empMobileNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empAddress='" + empAddress + '\'' +
                ", empMobileNo='" + empMobileNo + '\'' +
                ", empExperience='" + empExperience + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }


}
