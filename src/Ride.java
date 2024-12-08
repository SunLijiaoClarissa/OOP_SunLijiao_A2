import java.util.Iterator;
import java.util.LinkedList;

public class Ride implements RideInterface {
    private String rideName;
    private String rideType;
    private Employee operator;
    private boolean isOpen;
    private String description;
    private final LinkedList<Visitor> visitorQueue; // 排队游客的队列
    private final LinkedList<Visitor> rideHistory; // 乘坐过游乐设施的游客历史记录

    // 默认构造器
    public Ride() {
        this.rideName = "Unknown Ride";
        this.rideType = "Unknown Type";
        this.operator = null;
        this.isOpen = false;
        this.description = "No description available.";
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // 参数化构造器
    public Ride(String rideName, String rideType, Employee operator, boolean isOpen, String description) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.isOpen = isOpen;
        this.description = description;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // 添加游客到排队队列
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            visitorQueue.add(visitor);
            System.out.println("Success: Visitor '" + visitor.getName() + "' has been added to the queue.");
        } else {
            System.out.println("Failure: Visitor cannot be null.");
        }
    }

    // 从队列中移除游客
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitorQueue.remove(visitor)) {
            System.out.println("Success: Visitor '" + visitor.getName() + "' has been removed from the queue.");
        } else {
            System.out.println("Failure: Visitor '" + (visitor != null ? visitor.getName() : "unknown") + "' is not in the queue.");
        }
    }

    // 打印队列中的游客
    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.println("Visitors in the queue (in order of arrival):");
            for (Visitor visitor : visitorQueue) {
                System.out.println("- " + visitor);
            }
        }
    }

    // 模拟一次游乐设施运行周期
    @Override
    public void runOneCycle() {
        if (!visitorQueue.isEmpty()) {
            // 取出排队的第一个游客并让其乘坐游乐设施
            Visitor visitor = visitorQueue.poll();  // remove the first visitor in the queue
            System.out.println("Visitor '" + visitor.getName() + "' is taking the ride.");
            
            // 将游客添加到历史记录
            addVisitorToHistory(visitor);
        } else {
            System.out.println("No visitors in the queue.");
        }
    }

    // 将游客添加到游乐设施历史记录中
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor != null) {
            rideHistory.add(visitor);
            System.out.println("Success: Visitor '" + visitor.getName() + "' has been added to ride history.");
        } else {
            System.out.println("Failure: Visitor cannot be null.");
        }
    }

    // 检查游客是否在历史记录中
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (rideHistory.contains(visitor)) {
            System.out.println("Success: Visitor '" + visitor.getName() + "' is in the ride history.");
            return true;
        } else {
            System.out.println("Failure: Visitor '" + visitor.getName() + "' is not in the ride history.");
            return false;
        }
    }

    // 返回历史记录中的游客数量
    @Override
    public int numberOfVisitors() {
        int numOfVisitors = rideHistory.size();
        System.out.println("Number of visitors who have taken the ride: " + numOfVisitors);
        return numOfVisitors;
    }

    // 打印所有乘坐过游乐设施的游客信息
    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have taken this ride yet.");
        } else {
            System.out.println("Visitors who have taken the ride:");
            Iterator<Visitor> iterator = rideHistory.iterator();  // 创建迭代器
            while (iterator.hasNext()) {  // 使用迭代器进行遍历
                Visitor visitor = iterator.next();
                System.out.println("- " + visitor);
            }
        }
    }
    
    // 其他 getter 和 setter 方法
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

    @Override
    public String toString() {
        return "Ride{rideName='" + rideName + "', rideType='" + rideType + "', operator=" + operator + ", isOpen=" + isOpen + ", description='" + description + "'}";
    }
}
