// Write a program to explain System.in

// import java.io.FileInputStream;
import java.util.Scanner;

public class SystemInExample {
    public static void main(String[] args) throws Exception {

        // Example of int read(): reads one byte of data.
        // System.out.println("Enter only one caracter !!");

        // int data = System.in.read();

        // System.out.println("You entered : " + (char) data);

        // Example of int read(byte[] b): reads bytes into an array.

        // System.out.println("Enter some text : ");

        // byte[] buffer = new byte[20];

        // int bytesRead = System.in.read(buffer);

        // System.out.println("Bytes read: " + bytesRead);

        // System.out.println("Input: " + new String(buffer, 0, bytesRead));

        // Example of int read(byte[] b, int off, int len): reads bytes into part of an array.

        // byte[] buffer = new byte[20];

        // System.out.println("Enter text:");

        // off = 5 , Start storing data from index 5 of the array
        //len = 5 , Read only 5 bytes , Not more, not less
        // System.in.read(buffer, 5, 5);

        // for (int i = 0; i < buffer.length; i++) {
        //     System.out.println(i + " : " + (char) buffer[i]);
        // }

        // System.out.println(new String(buffer));

        // Example of void close(): closes the input stream.

        // System.in.close();
        // System.out.println("System.in closed");


        // int available(): returns the number of bytes that can be read without blocking.
        // available() is not reliable for keyboard input Mainly useful for file streams

        // FileInputStream fis = new FileInputStream("input.txt");

        // int availableBytes = fis.available();
        // System.out.println("Available bytes: " + availableBytes);

        // if (availableBytes > 0) {
        //     byte[] buffer = new byte[availableBytes];
        //     fis.read(buffer);

        //     System.out.println("File content:");
        //     System.out.println(new String(buffer));
        // } else {
        //     System.out.println("File is empty");
        // }

        // fis.close();
        // For real applications, avoid System.in.read() for text input.
        try (
        Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();

            System.out.println(input);
        }
    }
}