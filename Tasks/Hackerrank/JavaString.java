package Hackerrank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaString {

    public static void main(String[] args) {
//        List<String> text = new ArrayList<>();
//        text.add("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
//        text.add("<h1>Nayeem loves counseling</h1>");
//        text.add("<Amee>safat codes like a ninja</amee>");
//        text.add("<SA premium>Imtiaz has a secret crush</SA premium>");
//
//        for (String each : text) {
//            extractText(each);
//        }

//        Scanner scan  = new Scanner(System.in);
//        int testCases = Integer.parseInt(scan.nextLine());
//        while (testCases-- > 0) {
//            String line = scan.nextLine();
//            boolean matchFound = false;
//            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
//            Matcher m = r.matcher(line);
//            while (m.find()) {
//                System.out.println(m.group(2));
//                matchFound = true;
//            }
//            if (!matchFound) {
//                System.out.println("None");
//            }
//        }
//        scan.close();



    }

    private static void extractText(String str) {
        boolean validTag = false;

        while (true) {
            int openStart = str.indexOf('<');
            int openEnd = str.indexOf('>');
            int closeStart = str.indexOf("</");
            int closeEnd = str.indexOf('>', closeStart);

            if (openStart == -1 || openEnd == -1 || closeStart == -1 || closeEnd == -1) {
                break;
            }

            String openingTag = str.substring(openStart + 1, openEnd);
            String closingTage = str.substring(closeStart + 2, closeEnd);


            if (openingTag.equals(closingTage)) {
                if (!openingTag.isEmpty() || ! openingTag.isBlank()){
                    String text = "";
                    text = str.substring(openEnd + 1, closeStart);
                    if (text.startsWith("<")) {
                        text = text.substring(4);
                    }
                    System.out.println(text);
                    validTag = true;
                    str = str.substring(0, openStart) + str.substring(closeEnd + 1);
                }


            }else {
                str = str.substring(openEnd + 1);
            }


        }
        if (!validTag){
            System.out.println("None");
        }

    }


    public static int parseInt(String numStr) {
        // Your code here!
        // 300

        List<String> n = new ArrayList<>();

        n.add("ones");
        n.add("tens");
        n.add("hundreds");


        for (int i = 0; i < numStr.length(); i++) {

        }

        return -1;
    }

    public static Map<Integer, String> numbers() {
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        map.put(10, "ten");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");

        map.put(100, "hundred");
        map.put(1000, "thousand");


        return map;
    }
}
