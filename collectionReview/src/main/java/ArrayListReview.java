import java.util.*;

public class ArrayListReview{

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));

        // Iteration o ArrayList
        // 1: for loop
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println();
        System.out.println("------- Iterating list using Iterator -----------");

        // Iteration using iterator
        Iterator<Student> it = students.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------- Iterating list using ListIterator -----------");
        System.out.println("forward");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println();
        System.out.println("backward");
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }

        System.out.println();
        System.out.println("--------- for each loop ----------");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("---------- lambda ------------");
        students.forEach(System.out::println);

        System.out.println();
        System.out.println("----------- sorting element in list by id -------------");
        Collections.sort(students, new sortByIdDesc() );
        students.forEach(s -> System.out.println(s));

        System.out.println();
        System.out.println("----------- sorting element in list by name ASC order -------------");
        Collections.sort(students, new sortByNameASC() );
        students.forEach(s -> System.out.println(s));

        System.out.println();
        System.out.println("----------- sorting element in list by name DESC order -------------");
        Collections.sort(students, new sortByNameDESC() );
        students.forEach(s -> System.out.println(s));

    }

    static class sortByIdDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameASC implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

    static class sortByNameDESC implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
















