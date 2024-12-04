package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindnNumOfPairs {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(Arrays.asList(2,1,2,3));
        List<Integer> b = new ArrayList<>(Arrays.asList(1,1,4,3));

        System.out.println(findNumOfPairs(a,b));

    }


    public static int findNumOfPairs(List<Integer> a, List<Integer> b){

        Collections.sort(a);
        Collections.sort(b);

        int i = 0;
        int j = 0;
        int count = 0;
        while (i < a.size() && j < b.size()){
            if (a.get(i) > b.get(j)){
                count++;
                j++;
            }
            i++;
        }

        return count;
    }
}
