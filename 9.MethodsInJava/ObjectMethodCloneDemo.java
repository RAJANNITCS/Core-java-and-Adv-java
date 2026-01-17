// WAP to demostrating clone method

class Student implements Cloneable {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

}

public class ObjectMethodCloneDemo {

    public static void main(String[] args) throws Exception{
        Student s1 = new Student(24, "rohan singh");
        Student s2 = (Student) s1.clone();
        
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}