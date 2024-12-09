public class AssignmentTwo {
    public static void main(String[] args) {
        // The main method can be used to run the program or for testing purposes
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partSix(); // 调用 partFourB 方法来测试
    }

    // Method for part three of the assignment
    public void partThree() {
         // 创建一个 Employee 操作员
        Employee rideOperator = new Employee("John", 35, "789 Worker St", "john@example.com", "Ride Operator", "E12345", true);

         // 创建 Ride 对象，确保传递了 maxRider 参数
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", rideOperator, true, "A thrilling roller coaster ride.", 50);

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
        // 创建一个新的 Employee 操作员
        Employee rideOperator = new Employee("John", 35, "789 Worker St", "john@example.com", "Ride Operator", "E12345", true);

        // 创建一个新的 Ride 对象，并指定一个 Employee 操作员
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", rideOperator, true, "A thrilling roller coaster ride.", 50);
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
        // 创建一个新的 Employee 操作员
        Employee rideOperator = new Employee("John", 35, "789 Worker St", "john@example.com", "Ride Operator", "E12345", true);
    
        // 创建一个新的 Ride 对象
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", rideOperator, true, "A thrilling roller coaster ride.", 50);
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
    
        // 执行至少五个周期，使游客从队列中移到历史记录
        rollerCoaster.runOneCycle();  // visitor1 will be added to history
        rollerCoaster.runOneCycle();  // visitor2 will be added to history
        rollerCoaster.runOneCycle();  // visitor3 will be added to history
        rollerCoaster.runOneCycle();  // visitor4 will be added to history
        rollerCoaster.runOneCycle();  // visitor5 will be added to history
    
        // 打印未排序的游客集合
        System.out.println("Before sorting:");
        rollerCoaster.printRideHistory();
    
        // 排序游客集合
        rollerCoaster.sortVisitors();
    
        // 打印排序后的游客集合
        System.out.println("\nAfter sorting:");
        rollerCoaster.printRideHistory();
    }

    // Method for part five of the assignment
    public void partFive() {
        // Create a new Employee operator
        Employee rideOperator = new Employee("John", 35, "789 Worker St", "john@example.com", "Ride Operator", "E12345", true);
        
        // Create a new Ride object
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", rideOperator, true, "A thrilling roller coaster ride.", 50);
        // Create 10 Visitor objects
        Visitor visitor1 = new Visitor("Alice", 25, "123 Main St", "alice@example.com", "Adult", 100, true);
        Visitor visitor2 = new Visitor("Bob", 30, "456 Oak St", "bob@example.com", "Adult", 200, false);
        Visitor visitor3 = new Visitor("Charlie", 22, "789 Pine St", "charlie@example.com", "Child", 50, true);
        Visitor visitor4 = new Visitor("David", 45, "101 Maple St", "david@example.com", "Senior", 150, false);
        Visitor visitor5 = new Visitor("Eve", 29, "202 Birch St", "eve@example.com", "Adult", 300, true);
        Visitor visitor6 = new Visitor("Frank", 28, "303 Elm St", "frank@example.com", "Adult", 80, false);
        Visitor visitor7 = new Visitor("Grace", 33, "404 Cedar St", "grace@example.com", "Adult", 120, true);
        Visitor visitor8 = new Visitor("Hannah", 20, "505 Pine St", "hannah@example.com", "Child", 60, true);
        Visitor visitor9 = new Visitor("Ivy", 27, "606 Oak St", "ivy@example.com", "Adult", 90, false);
        Visitor visitor10 = new Visitor("Jack", 40, "707 Maple St", "jack@example.com", "Senior", 110, true);
        
        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);
        
        // Print all visitors in the queue before running the cycle
        System.out.println("Visitors in the queue before the cycle:");
        rollerCoaster.printQueue();
        
        // Run one cycle
        rollerCoaster.runOneCycle();  // Removes one visitor from the queue and adds them to the ride history
        
        // Print all visitors in the queue after one cycle
        System.out.println("\nVisitors in the queue after one cycle:");
        rollerCoaster.printQueue();
        
        // Print all visitors in the collection (ride history)
        System.out.println("\nVisitors in the collection (ride history):");
        rollerCoaster.printRideHistory();
    }

    // Method for part six of the assignment
    public void partSix() {
        // Implementation for part six goes here
         // Create a new Ride
        Ride rollerCoaster = new Ride("Thunderbolt", "Roller Coaster", null, true, "A thrilling roller coaster", 4);

         // Create at least 5 Visitor objects
        Visitor visitor1 = new Visitor("Alice", 25, "123 Main St", "alice@example.com", "Adult", 100, false);
        Visitor visitor2 = new Visitor("Bob", 30, "456 Elm St", "bob@example.com", "Adult", 200, true);
        Visitor visitor3 = new Visitor("Charlie", 22, "789 Oak St", "charlie@example.com", "Student", 150, false);
        Visitor visitor4 = new Visitor("David", 28, "101 Pine St", "david@example.com", "Adult", 120, true);
        Visitor visitor5 = new Visitor("Eve", 35, "202 Maple St", "eve@example.com", "Senior", 80, false);

         // Add Visitors to the Ride's history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

         // Export the visitors to a file
        rollerCoaster.exportRideHistory();
    }

    // Method for part seven of the assignment
    public void partSeven() {
        // Implementation for part seven goes here
    }
}
