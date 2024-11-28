package Hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOnLines = Integer.parseInt(scanner.nextLine());

        while (numOnLines-- > 0){

            String line = scanner.nextLine();
            boolean validTag = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()){
                System.out.println(matcher.group(2));
                validTag = true;
            }

            if (!validTag){
                System.out.println("None");
            }
        }
    }
}
