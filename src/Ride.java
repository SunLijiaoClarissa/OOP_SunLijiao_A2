public class Ride {
    // Instance variables for the Ride class
    private String rideName;    // The name of the ride (e.g., "Roller Coaster", "Ferris Wheel")
    private String rideType;    // The type of the ride (e.g., "Adventure", "Family", "Thrill")
    private Employee operator;  // The Employee assigned to operate the ride
    private boolean isOpen;     // Whether the ride is open or not
    private String description; // A description of the ride (e.g., "A thrilling roller coaster for adventure lovers.")

    // Default constructor
    public Ride() {
        this.rideName = "Unknown Ride";
        this.rideType = "Unknown Type";
        this.operator = null;  // No operator by default
        this.isOpen = false;   // Ride is closed by default
        this.description = "No description available.";  // Default description
    }

    // Parameterized constructor
    public Ride(String rideName, String rideType, Employee operator, boolean isOpen, String description) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.isOpen = isOpen;
        this.description = description;
    }

    // Getters and setters for Ride instance variables

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Ride{rideName='" + rideName + "', rideType='" + rideType + "', operator=" + operator +  ", isOpen=" + isOpen + ", description='" + description + "'}";
    }
}
