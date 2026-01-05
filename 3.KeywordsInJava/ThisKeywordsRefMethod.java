// Write a program to show this keywords use to refer current class method

class Calculator {

    void add() {
        System.out.println("Adding numbers.");
    }
    
    void calculate() {
        this.add(); // Calls the 'add' method of THIS object
    }
}

public class ThisKeywordsRefMethod {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add();
    }
}