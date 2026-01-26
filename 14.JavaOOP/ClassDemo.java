// WAP to demostrating class creation

// 1. Define the 'Student' Class (Blueprint)
class Student {
    // Properties (Data) of a Student
    int id; // Student's ID number
    String name; // Student's name

    // Constructor: This is called when we create a new Student object.
    // It helps set the initial id and name for that student.
    public Student(int studentId, String studentName) {
        this.id = studentId; // 'this.id' refers to the id of the current object
        this.name = studentName; // 'this.name' refers to the name of the current object
    }
}

// 2. 'ClassDemo' Class to use our 'Student' Class
public class ClassDemo {
    public static void main(String[] args) {
        // Creating an 'Object' (a real student) from the 'Student' Blueprint
        // 's1' is now an object of the Student class
        Student s1 = new Student(10, "Alice"); // We create Alice with ID 10
        // Accessing and printing the properties of our 's1' object
        System.out.println("Student ID: " + s1.id); // Output: Student ID: 10
        System.out.println("Student Name: " + s1.name); // Output: Student Name: Alice
    }
}
