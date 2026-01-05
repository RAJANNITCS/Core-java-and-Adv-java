// Write a program to explain this keywords pass the current object as an argument to a method

class Service {
    void process(User user) {
        System.out.println("Processing user: " + user.name);
    }
}

class User {
    String name;

    public void register(Service service) {
        service.process(this); // Passes THIS User object to the service
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ThisKeywordsRefParameter {
    public static void main(String[] args) {
        User obj = new User();
        obj.setName("rohan singh");
        Service sObj = new Service();
        obj.register(sObj);
    }
}