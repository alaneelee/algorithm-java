package Day_17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Programmers_84 {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" ")).filter(s -> !s.isEmpty()).toList().toArray(new String[0]);
    }

    public static void main(String[] args) {
        Programmers_84 sol = new Programmers_84();
        String[] strArr = {"and","notad","abcd"};

        System.out.println(sol.solution("i love you"));
    }
}


//class Solution {
//    public String[] solution(String my_string) {
//        return my_string.trim().split("[ ]+");
//    }
//}