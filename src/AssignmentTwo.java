public class AssignmentTwo {
    public static void main(String[] args) {
        // The main method can be used to run the program or for testing purposes
        AssignmentTwo assignment = new AssignmentTwo();
        // Run all parts in sequence for testing purposes
        assignment.partThree(); // Run part 3
        assignment.partFourA(); // Run part 4A
        assignment.partFourB(); // Run part 4B
        assignment.partFive();  // Run part 5
        assignment.partSix();   // Run part 6
        assignment.partSeven(); // Run part 7
    }

    // Method for part three of the assignment
    public void partThree() {
        System.out.println("=== Part Three ===");
         // 创建一个 Employee 操作员
        Employee rideOperator = new Employee("Zhangsan", 35, "789 Worker St11", "Zhangsan@qq.com", "Ride Operator", "E12345", true);

         // 创建 Ride 对象，确保传递了 maxRider 参数
        Ride rollerCoaster = new Ride("Ferris Wheel", "Sightseeing", rideOperator, true, "A giant Ferris wheel offering breathtaking views of the park and surrounding area. Perfect for a relaxing experience.", 50);

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
        System.out.println("=== Part FourA ===");
        // 创建一个新的 Employee 操作员
        Employee rideOperator = new Employee("Sunwu", 35, "789 Worker St", "Sunwu@qq.com", "Ride Operator", "1234666", true);

        // 创建一个新的 Ride 对象，并指定一个 Employee 操作员
        Ride rollerCoaster = new Ride("Haunted House", "Horror", rideOperator, true, "A spooky haunted house filled with ghosts, ghouls, and mysterious creatures. Dare to enter if you’re not afraid of the dark!", 50);
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
        System.out.println("=== Part FourB ===");
        // 创建一个新的 Employee 操作员
        Employee rideOperator = new Employee("Lisi", 35, "789 Worker St", "Lisi@qq.com", "Ride Operator", "12345", true);
    
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
        System.out.println("=== Part Five ===");
        // Create a new Employee operator
        Employee rideOperator = new Employee("Yueliu", 35, "789 Worker St", "Yueliu@qq.com", "Ride Operator", "234577", true);
        
        // Create a new Ride object
        Ride rollerCoaster = new Ride("Water Splash", "Water Ride", rideOperator, true, "A fun water ride where riders will be splashed with water as they navigate through twisting rivers and waterfalls.", 50);
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
        System.out.println("=== Part Six ===");
        // Implementation for part six goes here
        Employee rideOperator = new Employee("Pengyi", 35, "789 Worker St", "Pengyi@qq.com", "Ride Operator", "234588", true);
        
        // Create a new Ride object
        Ride rollerCoaster = new Ride("Space Adventure", "Sci-Fi", rideOperator, true, "An intergalactic journey through space, where riders experience weightlessness and zoom past distant stars and planets.", 50);

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
        System.out.println("=== Part Seven ===");
        // 1. 创建一个新的 Ride 对象
    Employee rideOperator = new Employee("Liba", 35, "789 Worker St", "Liba@qq.com", "Ride Operator", "E12345", true);
    Ride rollerCoaster = new Ride("Bumper Cars", " Interactive", rideOperator, true, "A fun and competitive ride where participants drive electric bumper cars and collide with others in a safe and exciting arena.", 50);

    // 2. 导入 CSV 文件（假设 CSV 文件路径是 "rideHistory.csv"）
    String filePath = "rideHistory.csv";  // 这个路径应该是之前导出的 CSV 文件路径
    rollerCoaster.importRideHistory(filePath);  // 使用 importRideHistory 方法导入游客数据

    // 3. 打印导入的游客数量
    int numberOfVisitors = rollerCoaster.numberOfVisitors();  // 使用 numberOfVisitors 方法获取游客数量
    System.out.println("Total number of visitors imported: " + numberOfVisitors);

    // 4. 打印所有导入的游客信息
    rollerCoaster.printRideHistory();  // 使用 printRideHistory 方法打印所有导入的游客信息
}
}
