package by.tachmeskills.yadevich.lesson16;

import by.tachmeskills.yadevich.lesson16.model.student.Student;

import java.util.*;

/**
 * Create a collection of passport numbers (String format).
 * Create a collection of students in our group.
 * Each collection should not have duplicate elements.
 * Create a key-value collection, where the key will be the passport number from the first collection,
 * and the value will be the Student class object from the second collection.
 * Loop through the key-value collection with a for-each loop and display the collection elements on the screen.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Set<String> passportNumbers = new LinkedHashSet<>();
        Set<Student> students = new LinkedHashSet<>();

        Map<String, Student> passportAndMembers = new HashMap<>();

        passportNumbers.add("3254354662342");
        passportNumbers.add("4867458534756");
        passportNumbers.add("4867458530900");
        passportNumbers.add("4867458532345");
        passportNumbers.add("4867123465435");
        passportNumbers.add("4867409865435");
        passportNumbers.add("4897658765435");
        passportNumbers.add("48674sdx65435");
        passportNumbers.add("4867458zdf735");
        passportNumbers.add("4867458xfg635");
        passportNumbers.add("4867234565435");
        passportNumbers.add("4867458456435");
        passportNumbers.add("486745876we35");
        passportNumbers.add("4df6458765435");
        passportNumbers.add("4867458765435");

        Student student1 = new Student("Marina");
        Student student2 = new Student("Kate");
        Student student3 = new Student("Oleg");
        Student student4 = new Student("Kirill");
        Student student5 = new Student("Flaffic");
        Student student6 = new Student("Rita");
        Student student7 = new Student("Ilya");
        Student student8 = new Student("Flame-host");
        Student student9 = new Student("Dmitry");
        Student student10 = new Student("Vlad");
        Student student11 = new Student("Igor");
        Student student12 = new Student("Sergio");
        Student student13 = new Student("Dmitry");
        Student student14 = new Student("Daniil");
        Student student15 = new Student("Sultan");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);

        Iterator<String> passportNumbersIterator = passportNumbers.iterator();
        Iterator<Student> studentsIterator = students.iterator();

        while (passportNumbersIterator.hasNext() && studentsIterator.hasNext()) {
            passportAndMembers.put(passportNumbersIterator.next(), studentsIterator.next());
        }

        passportAndMembers.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
