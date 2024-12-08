
public interface RideInterface {
    // Add a visitor to the queue
    void addVisitorToQueue(Visitor visitor);

    // Remove a visitor from the queue
    void removeVisitorFromQueue(Visitor visitor);

    // Print the list of waiting visitors in the queue
    void printQueue();

    // Run the ride for one cycle
    void runOneCycle();

    // Add a visitor to the ride history
    void addVisitorToHistory(Visitor visitor);

    // Check whether the visitor is in the ride history
    boolean checkVisitorFromHistory(Visitor visitor);

    // Return the number of visitors in the ride history
    int numberOfVisitors();

    // Print the list of visitors who took the ride
    void printRideHistory();
}
