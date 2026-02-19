import java.io.InputStream;
import java.io.FileInputStream;

public class IOExample {

    public static void main(String[] args) throws Exception {

        InputStream input = new FileInputStream("test.txt");
        // Using abstraction

        int data = input.read();
        System.out.println(data);

        input.close();
    }
}
