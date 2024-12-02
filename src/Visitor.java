public class Visitor extends Person {
    private String ticketType;
    private boolean hasMembership;

    // Default constructor
    public Visitor() {}

    // Parameterized constructor
    public Visitor(String name, int age, String contactNumber, String ticketType, boolean hasMembership) {
        super(name, age, contactNumber); // Call parent class constructor
        this.ticketType = ticketType;
        this.hasMembership = hasMembership;
    }

    // Getters and Setters
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean isHasMembership() {
        return hasMembership;
    }

    public void setHasMembership(boolean hasMembership) {
        this.hasMembership = hasMembership;
    }
}
