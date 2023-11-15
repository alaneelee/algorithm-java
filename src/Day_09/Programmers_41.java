package Day_09;

import java.util.ArrayList;

public class Programmers_41 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1]+1);
        }

        return answer;
    }


    public static void main(String[] args) {
        Programmers_41 sol = new Programmers_41();
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = { {0, 4},{1, 2},{3, 5},{7, 7}};
        System.out.println(sol.solution(my_strings,parts));
    }
}



