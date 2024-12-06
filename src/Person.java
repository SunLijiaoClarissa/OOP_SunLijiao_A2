public class Person {
    // Instance variables
    private String name;
    private int age;
    private String address;
    private String email; // 新添加的 Email 实例变量

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not Provided";
        this.email = "Not Provided"; // 默认值为 "Not Provided"
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
        this.age = age;
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
        this.email = email;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "', email='" + email + "'}";
    }
}
