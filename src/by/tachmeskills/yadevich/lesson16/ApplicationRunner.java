package by.tachmeskills.yadevich.lesson16;

import by.tachmeskills.yadevich.lesson16.model.student.Student;

import java.util.*;

/** Create a collection of passport numbers (String format).
 Create a collection of students in our group.
 Each collection should not have duplicate elements.
 Create a key-value collection, where the key will be the passport number from the first collection,
 and the value will be the Student class object from the second collection.
 Loop through the key-value collection with a for-each loop and display the collection elements on the screen.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Set<String> passwordNumber = new LinkedHashSet<>();
        Set<Student> memberOurGroup = new HashSet<>();

        Map<Set<String>, Set<Student>> passwordAndMembers = new HashMap<>();

        passwordNumber.add("3254354662342");
        passwordNumber.add("4867458534756");
        passwordNumber.add("4867458530900");
        passwordNumber.add("4867458532345");
        passwordNumber.add("4867123465435");
        passwordNumber.add("4867409865435");
        passwordNumber.add("4897658765435");
        passwordNumber.add("48674sdx65435");
        passwordNumber.add("4867458zdf735");
        passwordNumber.add("4867458xfg635");
        passwordNumber.add("4867234565435");
        passwordNumber.add("4867458456435");
        passwordNumber.add("486745876we35");
        passwordNumber.add("4df6458765435");
        passwordNumber.add("4867458765435");

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

        memberOurGroup.add(student1);
        memberOurGroup.add(student2);
        memberOurGroup.add(student3);
        memberOurGroup.add(student4);
        memberOurGroup.add(student5);
        memberOurGroup.add(student6);
        memberOurGroup.add(student7);
        memberOurGroup.add(student8);
        memberOurGroup.add(student9);
        memberOurGroup.add(student10);
        memberOurGroup.add(student11);
        memberOurGroup.add(student12);
        memberOurGroup.add(student13);
        memberOurGroup.add(student14);
        memberOurGroup.add(student15);

        passwordAndMembers.put(passwordNumber, memberOurGroup);

        passwordAndMembers.forEach((k, v) -> System.out.println(k + " -> " + v));

        for(Map.Entry< Set<String>, Set <Student>> entry: passwordAndMembers.entrySet()){ // посмотрела у Екатерины , адаптировала под свой
            System.out.println("Password: " + entry.getKey() + ", " + entry.getValue());

            // не знаю как вывести чтобы было ключ-значение: "номер паспорта" --> Студент
        }
    }
}