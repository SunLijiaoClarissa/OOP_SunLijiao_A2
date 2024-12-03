import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private final Queue<Visitor> waitingLine = new LinkedList<>();
    private final List<Visitor> rideHistory = new LinkedList<>();

    public Ride(String rideName) {
        this.rideName = rideName;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        waitingLine.add(visitor);
        System.out.println(visitor.getName() + " added to the waiting line.");
    }

    @Override
    public void removeVisitorFromQueue() {
        if (!waitingLine.isEmpty()) {
            Visitor removedVisitor = waitingLine.poll();
            System.out.println(removedVisitor.getName() + " removed from the waiting line.");
        } else {
            System.out.println("The waiting line is empty.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in the waiting line: ");
        for (Visitor visitor : waitingLine) {
            System.out.println("- " + visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {
        int maxVisitorsPerCycle = 2; // 假设每次最多允许2人游玩
        System.out.println("Running ride: " + rideName);
        for (int i = 0; i < maxVisitorsPerCycle && !waitingLine.isEmpty(); i++) {
            Visitor visitor = waitingLine.poll();
            System.out.println(visitor.getName() + " is riding.");
            addVisitorToHistory(visitor);
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to the ride history.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Visitors who took the ride: ");
        for (Visitor visitor : rideHistory) {
            System.out.println("- " + visitor.getName());
        }
    }
}
