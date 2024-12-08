public class AssignmentTwo {
    public static void main(String[] args) {
        // The main method can be used to run the program or for testing purposes
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(); // 调用 partThree 方法来测试
    }

    // Method for part three of the assignment
    public void partThree() {
        // 创建一个新的 Ride 对象
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", null, true, "A thrilling roller coaster ride.");

        // 创建5个 Visitor 对象
        Visitor visitor1 = new Visitor("Alice", 25, "123 Main St", "alice@example.com", "Adult", 100, true);
        Visitor visitor2 = new Visitor("Bob", 30, "456 Oak St", "bob@example.com", "Adult", 200, false);
        Visitor visitor3 = new Visitor("Charlie", 22, "789 Pine St", "charlie@example.com", "Child", 50, true);
        Visitor visitor4 = new Visitor("David", 45, "101 Maple St", "david@example.com", "Senior", 150, false);
        Visitor visitor5 = new Visitor("Eve", 29, "202 Birch St", "eve@example.com", "Adult", 300, true);

        // 使用 addVisitorToQueue 方法向队列中添加5个 Visitor
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // 使用 removeVisitorFromQueue 方法从队列中移除一个 Visitor
        rollerCoaster.removeVisitorFromQueue(visitor3);

        // 打印所有等待的 Visitors
        rollerCoaster.printQueue();
    }

    // Method for part four A of the assignment
    public void partFourA() {
        // Implementation for part four A goes here
    }

    // Method for part four B of the assignment
    public void partFourB() {
        // Implementation for part four B goes here
    }

    // Method for part five of the assignment
    public void partFive() {
        // Implementation for part five goes here
    }

    // Method for part six of the assignment
    public void partSix() {
        // Implementation for part six goes here
    }

    // Method for part seven of the assignment
    public void partSeven() {
        // Implementation for part seven goes here
    }
}
