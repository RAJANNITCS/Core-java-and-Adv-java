// WAP to demostrating HashTable class and method example

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {

        // Creating Hashtable object
        Hashtable<Integer, String> ht = new Hashtable<>();

        // Adding key-value pairs
        ht.put(101,"Amit"); 
        ht.put(102, "Rahul");
        ht.put(103, "Neha");

        // Printing HashTable
        System.out.println(ht);

        // Getting value using key
        String name = ht.get(101);
        System.out.println(name);

        // Removing a key
        ht.remove(102);
        
        // Checking key
        System.out.println(ht.containsKey(103));

        // Checking Value
        System.out.println(ht.containsValue("Neha"));

        System.out.println(ht);
    } 
}
