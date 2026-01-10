// WAP to demonstrating Static variable

class Student {
    public int age;
    public String name;

    // static variable
    static String Training_Center = "Java Training";

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Student name = " + this.name + " age = " + this.age + " Tranining = " + Training_Center);
    }

}
public class StaticKeywordsUseAsVariable {
    public static void main(String[] args) {
        Student s1 = new Student(25, "rohan");
        Student s2 = new Student(26, "Seema");
        s1.display();
        s2.display();
    
    }
}