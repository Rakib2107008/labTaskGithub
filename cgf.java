 class Student {
    // Fields (attributes)
    private int id;
    private String name;
    private int age;
    private String department;

    // Default constructor (no arguments)
    public Student() {
    }

    // Parameterized constructor
    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getterss
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString method
    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}

public class cgf {
    public static void main(String[] args) {
        // Using parameterized constructor
        Student s1 = new Student(101, "Rakib", 21, "CSE");
 Student s3 = new Student(103, "Riyad", 20, "CSE");
        // Using default constructor + setters
        Student s2 = new Student();
        s2.setId(102);
        s2.setName("Rahim");
        s2.setAge(22);
        s2.setDepartment("EEE");
Student s4 = new Student(104, "Sakib", 22, "CSE");
        // Print
        System.out.println(s1);
        System.out.println(s2);
    }
}
