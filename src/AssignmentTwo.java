public class AssignmentTwo {
    public static void main(String[] args) {
        // The main method can be used to run the program or for testing purposes
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partFourA(); // 调用 partFourA 方法来测试
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
        // 创建一个新的 Employee 对象（操作员）
        Employee rideOperator = new Employee("John", 35, "789 Worker St", "john@example.com", "Ride Operator", "E12345", true);

        // 创建一个新的 Ride 对象，并指定一个 Employee 操作员
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", rideOperator, true, "A thrilling roller coaster ride.");

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

        // 模拟游乐设施运行周期，游客会被移出队列并添加到历史记录
        rollerCoaster.runOneCycle();  // visitor1 will be added to history
        rollerCoaster.runOneCycle();  // visitor2 will be added to history
        rollerCoaster.runOneCycle();  // visitor3 will be added to history

        // 检查游客是否在历史记录中
        rollerCoaster.checkVisitorFromHistory(visitor1); // Should be true
        rollerCoaster.checkVisitorFromHistory(visitor4); // Should be false

        // 打印历史记录中游客的数量
        rollerCoaster.numberOfVisitors();  // Print number of visitors in history

        // 打印所有历史记录中的游客信息
        rollerCoaster.printRideHistory();  // Print details of all visitors in history
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
