public class AssignmentTwo {
    public static void main(String[] args) {
        // Example usage
        Employee employee = new Employee("John", 30, "123456789", "Ride Operator", 35000);
        Visitor visitor = new Visitor("Alice", 25, "987654321", "Adult", true);
        Ride ride = new Ride("Roller Coaster", 50, employee);

        System.out.println("Employee: " + employee.getName() + ", Job Title: " + employee.getJobTitle());
        System.out.println("Visitor: " + visitor.getName() + ", Ticket Type: " + visitor.getTicketType());
        System.out.println("Ride: " + ride.getRideName() + ", Operator: " + ride.getRideOperator().getName());
    }
}
