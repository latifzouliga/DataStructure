import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        /** Wy do we need to implement hashCode and equals() methods? */

        // hashSet is using hashing mechanism and creating a hashCode to storing the element
        // if we don't override and implement hashCode() method, it is not going to be able to compare these two items (name and id)
        // 1. create a set

        Set<Student> mySet = new HashSet<>();
        mySet.add(new Student(7, "Idadet"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Muhabbet"));
        // Set does not accept duplicates but this object will be added because it is considered another object
        // to prevent this issue we need to override equals() and hashCode() methods in Student class
        mySet.add(new Student(9, "Muhabbet"));

        mySet.forEach(System.out::println);

        System.out.println();
        // set can not accept duplicate
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));


        System.out.println();
        // Find the first repeating character
        // Example:
        // String = "Java Developer"
        // Output:
        // a

        String str = "Java Developer";

        Character r1 = firstRepeatingChar(str);
        System.out.println("The first repeating character is: " + r1);

        Character r2 = firstRepeatingChar("Python Programming language?");
        System.out.println("The first repeating character is: " + r2);

        Character r3 = firstRepeatingChar("Latif");
        System.out.println("The first repeating character is: " + r3);


    }

    private static Character firstRepeatingChar(String str) {

        Set<Character> set = new LinkedHashSet<>();
        for (char each : str.toCharArray()) {
            if (!set.add(each)) {
                return each;
            }
        }
        return null;
    }
}
