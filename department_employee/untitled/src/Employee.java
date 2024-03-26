public class Employee {
    private String name;
    private long id;
    private double salary;
    private String jobTitle;
    private Department deptInCharge;//encarregado de departamento
    private Department dept;


    public Employee(String name, long id, double salary, String jobTitle, Department dept, Department deptInCharge) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.deptInCharge = deptInCharge;
        this.dept =dept;
    }

    public void printState(){}
    public void getAnnualSalary(){}
}
