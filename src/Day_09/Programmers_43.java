package Day_09;

import java.util.Arrays;

public class Programmers_43 {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }


    public static void main(String[] args) {
        Programmers_43 sol = new Programmers_43();
        System.out.println(sol.solution("banana"));
    }
}



