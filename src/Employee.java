public class Employee extends Person {
    // Instance variables specific to Employee
    private String position;  // The job position of the employee (e.g., "Ride Operator", "Security")
    private String employeeID; // Employee's unique identifier
    private boolean isFullTime; // Whether the employee is full-time or part-time

    // Default constructor
    public Employee() {
        // Call the default constructor of the Person class
        super();
        this.position = "Unknown";
        this.employeeID = "Not Assigned";
        this.isFullTime = true;
    }

    // Parameterized constructor
    public Employee(String name, int age, String address, String email, String position, String employeeID, boolean isFullTime) {
        super(name, age, address, email);  // Call the Person class constructor
        this.position = position;
        this.employeeID = employeeID;  // Correct the parameter name and assignment
        this.isFullTime = isFullTime;
    }

    // Getters and setters for Employee instance variables
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Employee{ " + super.toString() + ", position='" + position + "', employeeID='" + employeeID + "', isFullTime=" + isFullTime + " }";
    }
}
