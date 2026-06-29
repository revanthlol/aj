//Program to implement Comparator interface
import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Rahul", 22));
        list.add(new Student(102, "Anita", 20));
        list.add(new Student(103, "Kiran", 21));

        Collections.sort(list, new AgeComparator());

        System.out.println("Students sorted by Age:");

        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }
}