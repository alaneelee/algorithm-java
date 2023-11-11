package Day_03;

import java.util.Arrays;

public class Programmers_12 {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for (String s: arr) {
            answer.append(s);
        }

        return answer.toString();

        // return String.join("", arr);
    }
    public static void main(String[] args) {
        Programmers_12 sol = new Programmers_12();
        String[] arr = {"a","b","c"};
        System.out.println(sol.solution(arr));
    }
}