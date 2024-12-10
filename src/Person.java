public abstract class Person {
    // Instance variables
    private String name;
    private int age;
    private String address;
    private String email; // 新添加的 Email 实例变量

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "null";
        this.email = "null"; // 默认值为 "null"
    }

    // Parameterized constructor
    public Person(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // 假设年龄应在 0 到 120 之间
            this.age = age;
        } else {
            System.out.println("Invalid age value.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) { // Basic email validation
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return String.format("Person [name='%s', age=%d, address='%s', email='%s']", name, age, address, email);
    }
}
