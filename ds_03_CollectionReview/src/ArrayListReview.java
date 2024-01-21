import java.util.*;

public class ArrayListReview{

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));
        students.add(new Student(1, "Jose"));
        Student student1 = new Student(1, "Jose");
        Student student2 = new Student(1, "Jose");


        // Iteration o ArrayList
        // 1: for loop
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }


        System.out.println("\n------- Iterating list using Iterator -----------");

        // Iteration using iterator
        Iterator<Student> it = students.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\n--------- Iterating list using Iterator -----------");
        System.out.println("forward");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        System.out.println("\nbackward");
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }

        System.out.println("\n--------- Iterating list using ListIterator -----------");
        ListIterator<Student> iterator = students.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n--------- Iterating list using ListIterator - Backward -----------");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println("\n--------- for each loop ----------");
        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println("\n---------- lambda ------------");
        students.forEach(System.out::println);


        System.out.println("\n----------- sorting element in list by id DESC-------------");
        Collections.sort(students, new sortByIdDesc() );
        //Collections.sort(students, Comparator.comparing(Student::getId).reversed() );
        students.forEach(System.out::println);


        System.out.println("\n----------- sorting element in list by name ASC order -------------");
        Collections.sort(students, new sortByNameASC() );
        //Collections.sort(students, Comparator.comparing(Student::getId) );
        students.forEach(System.out::println);

        ;
        System.out.println("\n----------- sorting element in list by name DESC order -------------");
        Collections.sort(students, new sortByNameDESC() );
        //Collections.sort(students, Comparator.comparing(Student::getName) );
        students.forEach(System.out::println);


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
















