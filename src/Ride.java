import java.util.LinkedList;      // 导入 Queue 接口
import java.util.Queue; // 导入 LinkedList 类（它实现了 Queue 接口）

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee rideOperator;

    // 访客队列和游乐设施历史记录队列
    // 将字段声明为 final
    private final Queue<Visitor> waitingQueue = new LinkedList<>();
    private final Queue<Visitor> rideHistory = new LinkedList<>();

    // Default constructor
    public Ride() {}

    // Parameterized constructor
    public Ride(String rideName, int capacity, Employee rideOperator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.rideOperator = rideOperator;
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    // 实现 RideInterface 中的方法

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (waitingQueue.size() < capacity) {
            waitingQueue.add(visitor); // 使用 LinkedList 的 add 方法
            System.out.println(visitor.getName() + " has been added to the queue for the ride: " + rideName);
        } else {
            System.out.println("The queue is full, " + visitor.getName() + " cannot be added.");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (waitingQueue.contains(visitor)) {
            waitingQueue.remove(visitor); // 使用 LinkedList 的 remove 方法
            System.out.println(visitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println(visitor.getName() + " is not in the queue.");
        }
    }

    @Override
    public void printQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("No visitors are waiting in the queue.");
        } else {
            System.out.println("Visitors in the queue:");
            for (Visitor visitor : waitingQueue) {
                System.out.println(visitor.getName());
            }
        }
    }

    @Override
    public void runOneCycle() {
        if (!waitingQueue.isEmpty()) {
            Visitor visitor = waitingQueue.poll(); // 使用 LinkedList 的 poll 方法（移除队列头部元素）
            addVisitorToHistory(visitor);  // 将访客添加到历史记录
            System.out.println(visitor.getName() + " has ridden the " + rideName + " ride.");
        } else {
            System.out.println("No visitors are waiting for the ride.");
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor); // 使用 LinkedList 的 add 方法（将访客加入历史记录）
        System.out.println(visitor.getName() + " has been added to the ride history.");
    }

    @Override
    public void checkVisitorFromHistory(Visitor visitor) {
        if (rideHistory.contains(visitor)) {
            System.out.println(visitor.getName() + " is in the ride history.");
        } else {
            System.out.println(visitor.getName() + " has not ridden the " + rideName + " yet.");
        }
    }

    @Override
    public void numberOfVisitors() {
        System.out.println("Number of visitors who have ridden the " + rideName + ": " + rideHistory.size());
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have ridden the " + rideName + " yet.");
        } else {
            System.out.println("Ride history for " + rideName + ":");
            for (Visitor visitor : rideHistory) {
                System.out.println(visitor.getName());
            }
        }
    }
}
