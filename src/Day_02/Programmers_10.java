package Day_02;

import java.util.Scanner;

public class Programmers_10 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        return answer;
    }

    public static void main(String[] args) {
        Programmers_10 sol = new Programmers_10();
        System.out.println(sol.solution("He11oWor1d", "lloWorl",2));
    }
}