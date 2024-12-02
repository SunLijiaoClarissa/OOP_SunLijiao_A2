public class Employee extends Person {
    private String position;
    private double salary;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, int age, String contactNumber, String position, double salary) {
        super(name, age, contactNumber); // Call parent class constructor
        this.position = position;
        this.salary = salary;
    }

    // Getters and Setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

