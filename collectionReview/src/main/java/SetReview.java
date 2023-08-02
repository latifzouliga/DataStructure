import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        // 1. create a set

        Set<Student> mySet = new HashSet<>();
        mySet.add(new Student(7,"Idadet"));
        mySet.add(new Student(8,"Ahmet"));
        mySet.add(new Student(9,"Muhabbet"));

        System.out.println(mySet);

        // set can not accept duplicate
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));


        // Find the first repeating character
        // Example:
        // String = "Java Developer"
        // Output:
        // a

        String str = "Java Developer";

        Character r1 = firstRepeatingChar(str);
        System.out.println(r1);

        Character r2 = firstRepeatingChar("Python Programming language?");
        System.out.println(r2);

        Character r3 = firstRepeatingChar("how are you?");
        System.out.println(r3);



    }

    private static Character firstRepeatingChar(String str) {

        Set<Character> set = new LinkedHashSet<>();
        for(char each : str.toCharArray()){
            if (!set.add(each)){
               return each;
            }
        }
        return null;
    }
}
