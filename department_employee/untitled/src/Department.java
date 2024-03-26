public class Department {
    private String name;
    private int code;
    private String location;
    private int phoneExtension;
    private double budget;
    private Employee chief;
    private Employee[] staff;
    private int countEmployee;


    public Department(String name, int code, String location, int phoneExtension, double budget, Employee chief) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.phoneExtension = phoneExtension;
        this.budget = budget;
        this.chief = chief;
        this.staff = new Employee[100];
        this.countEmployee = 0;
    }

    public void addEmployee(Employee employee){
        staff[countEmployee] = employee;
        countEmployee++;
    }
    public void removeEmployee(Employee employee){}
    public void removeEmployee(long id){}
    public void listAllEmployees(){}

    public int sizeOfEmployees(){return 0;}
    public Employee getEmployee(long id){return null;}


}
