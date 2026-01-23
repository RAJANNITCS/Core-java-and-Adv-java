// WAP to demostrating of creating immutable class in java 

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//  Rule 1 : final class (no inheritance)
final class Student {

    // Rule 2 & 3 : private and final fields
    private final String name;
    private final Date dateOfBirth;
    private final List<String> grades;

    public Student (String name, Date dob, List<String> grades) {
        this.name = name;

        // Rule 5: Deep copy of mutable objects in Constructor
        // We create a NEW Date object so the caller can't change ours
        this.dateOfBirth = new Date(dob.getTime());

        // Rule 5: Deep copy of List
        // We create a NEW list so the caller can't modify the one we store
        this.grades = new ArrayList<>(grades);
    }

    // Rule 4: Only Getters, no Setters
    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        // Rule 5: Return a NEW Date object (Defensive Copy)
        return new Date(dateOfBirth.getTime());
    }

    public List<String> getGrades() {
        // Rule 5: Return an unmodifiable view or a copy
        return Collections.unmodifiableList(grades);
    }
    
}