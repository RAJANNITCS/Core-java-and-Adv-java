// WAP to explain Assignment operator 

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int n = 10;
        
        // n = n + 5
        n += 5;  
        System.out.println("After += : " + n);
        
        // n = n * 2
        n *= 2;  
        System.out.println("After *= : " + n);
        
        // n = n - 5
        n -= 5;
        System.out.println("After -= : " + n);
        
        // n = n / 2
        n /= 2;  
        System.out.println("After /= : " + n);
        
        // n = n % 3
        n %= 3;
        System.out.println("After %= : " + n);
        
    }
}