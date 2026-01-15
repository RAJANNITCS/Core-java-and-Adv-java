// WAP to demostrating private Access Modifier


class Person {
    // private variable 
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class AccessModifierPrivateDemo {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("roshan singh");

        //Error : 'name'
        // System.out.println(p.name);

        System.out.println(obj.getName());
    }
}