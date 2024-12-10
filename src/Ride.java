import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
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
    private int maxRider;  // 每个周期最多可接待的游客数量
    private int numOfCycles; // 游乐设施已运行的周期数

    // 默认构造器
    public Ride() {
        this.rideName = "Unknown Ride";
        this.rideType = "Unknown Type";
        this.operator = null;
        this.isOpen = false;
        this.description = "No description available.";
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 1;  // 至少可以接待1个游客
        this.numOfCycles = 0; // 默认周期数为0
    }

    // 参数化构造器
    public Ride(String rideName, String rideType, Employee operator, boolean isOpen, String description, int maxRider) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.isOpen = isOpen;
        this.description = description;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = maxRider >= 1 ? maxRider : 1;  // 确保maxRider至少为1
        this.numOfCycles = 0;
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
        // 如果没有操作员，不能运行
        if (operator == null) {
            System.out.println("Cannot run the ride: No operator assigned.");
            return;
        }

        // 如果队列中没有游客，不能运行
        if (visitorQueue.isEmpty()) {
            System.out.println("Cannot run the ride: No waiting visitors in the queue.");
            return;
        }

        // 计算本周期接待的游客数量，最多为 maxRider 或队列中游客数量
        int visitorsToRide = Math.min(maxRider, visitorQueue.size());
        for (int i = 0; i < visitorsToRide; i++) {
            Visitor visitor = visitorQueue.poll(); // 从队列中取出游客
            addVisitorToHistory(visitor); // 将游客添加到历史记录中
        }
        // 自动排序游客历史记录
        sortVisitors();

        // 增加周期计数
        numOfCycles++;
        System.out.println("Ride has been run successfully. Total cycles: " + numOfCycles);
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

    // 使用 VisitorComparator 对游客历史记录进行排序
    public void sortVisitors() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Visitors sorted by points, age, and fast track status.");
    }

    // Part 6 - Export Ride History to CSV File
    public void exportRideHistory() {
        String filePath = "rideHistory.csv"; // File path, can be changed if needed

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Writing the header row
            writer.write("Name,Age,Address,Email,Ticket Type,Points,Has Fast Track");
            writer.newLine();

            // Write each visitor's details to the CSV
            for (Visitor visitor : rideHistory) {
                String visitorData = visitor.getName() + "," +
                                     visitor.getAge() + "," +
                                     visitor.getAddress() + "," +
                                     visitor.getEmail() + "," +
                                     visitor.getTicketType() + "," +
                                     visitor.getPoints() + "," +
                                     visitor.hasFastTrack();
                writer.write(visitorData);
                writer.newLine();  // Move to the next line for the next visitor
            }

            System.out.println("Ride history has been successfully exported to " + filePath);
        } catch (IOException e) {
            // Handle errors related to file writing
            System.err.println("Error while exporting ride history to file: " + e.getMessage());
        }
    }

    // Part 7 - Import Ride History from a CSV File
    public void importRideHistory(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            // Skip header line
            reader.readLine();
            
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // Assuming the CSV format
                
                if (data.length != 7) {
                    System.err.println("Skipping invalid line: " + line);
                    continue; // Skip any line with incorrect number of fields
                }

                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String address = data[2];
                String email = data[3];
                String ticketType = data[4];
                int points = Integer.parseInt(data[5]);
                boolean fastTrack = Boolean.parseBoolean(data[6]);

                // Create a new Visitor object
                Visitor visitor = new Visitor(name, age, address, email, ticketType, points, fastTrack);

                // Add the visitor to the ride history
                addVisitorToHistory(visitor);
            }

            System.out.println("Ride history has been successfully imported from " + filename);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing data: " + e.getMessage());
        }
    }
     // 自定义异常
    public static class InvalidDataFormatException extends Exception {
        public InvalidDataFormatException(String message) {
            super(message);
        }
    }
    // Other getter and setter methods
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
