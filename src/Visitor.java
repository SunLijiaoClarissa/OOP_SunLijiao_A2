public class Visitor extends Person {
    // Instance variables specific to Visitor
    private String ticketType;  // 票价类型 (e.g., "Adult", "Child", "Senior")
    private int points;  // 积分 (e.g., loyalty points)
    private boolean hasFastTrack;  // 是否有快速通道

    // Default constructor
    public Visitor() {
        // Call the default constructor of the Person class
        super();
        this.ticketType = "Standard";  // 默认票价类型
        this.points = 0;  // 默认积分为0
        this.hasFastTrack = false;  // 默认没有快速通道
    }

    // Parameterized constructor
    public Visitor(String name, int age, String address, String email, String ticketType, int points, boolean hasFastTrack) {
        super(name, age, address, email);  // 调用Person类的构造器
        this.ticketType = ticketType;
        this.points = points;
        this.hasFastTrack = hasFastTrack;
    }

    // Getters and setters for Visitor instance variables
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean hasFastTrack() {
        return hasFastTrack;
    }

    public void setHasFastTrack(boolean hasFastTrack) {
        this.hasFastTrack = hasFastTrack;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Visitor{ " + super.toString() + ", ticketType='" + ticketType + "', points=" + points + ", hasFastTrack=" + hasFastTrack + " }";
    }
}


