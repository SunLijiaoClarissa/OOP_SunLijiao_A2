public class AssignmentTwo {
    public static void main(String[] args) {
        Employee operator = new Employee("John Doe", 30, "123-456-7890", "Ride Operator", 45000);
    Ride rollerCoaster = new Ride("Extreme Roller Coaster", 20, operator);

    System.out.println("Ride Name: " + rollerCoaster.getRideName());
    System.out.println("Operator: " + rollerCoaster.getOperator().getName());
    }
    public void partThree() {}
    public void partFourA() {}
    public void partFourB() {}
    public void partFive() {}
    public void partSix() {}
    public void partSeven() {}
}
