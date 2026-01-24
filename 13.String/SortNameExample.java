// WAP to demostarating sorting name list in alphabetical order

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

public class SortNameExample {
    public static void main(String[] args) {

        // Create a list of names
        List<String> names = new ArrayList<>();

        // Add name to the list
        names.add("rohan");
        names.add("sohan");
        names.add("ravi");

        // // Sort the list in alphabetical order
        // Collections.sort(names);

        // sort using lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));

        // Print the sorted lit
        System.out.println(names);
    }
}