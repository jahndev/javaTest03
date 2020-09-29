// you can also use imports, for example:
import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println(solution("Wed", 2)+" expected Fri");
        System.out.println(solution("Sat", 23)+" expected Mon");
    }

    public static String solution(String S, int K) {
        // write your code in Java SE 8
        List<String> daysOfWeek = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
        int offSet = daysOfWeek.indexOf(S);
        int i = (K+ offSet)%7;
        System.out.println(" offSet="+offSet+ " K="+K+ " i="+ i );
        return daysOfWeek.get(i);
    }
}
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");