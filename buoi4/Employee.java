public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int annualSalary() {
        return this.salary * 12;
    }

    public void upToSalary(int percent) 
    {
        this.salary += this.salary * percent / 100;
    }
    
    public String GetFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void display() {
        System.out.println("ID: " + Integer.toString(this.id));
        System.out.println("Full Name: " + this.GetFullName());
        System.out.println("Salary: " + Integer.toString(this.salary));
        System.out.println("Annual Salary: " + Integer.toString(this.annualSalary()));

    }
}