package Day_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_62 {

    public String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if ("l".equals(str_list[i])) {
                if (i > 0) {
                    return Arrays.copyOfRange(str_list, 0, i);
                }
                break;
            } else if ("r".equals(str_list[i])) {
                if (i < str_list.length -1) {
                    return Arrays.copyOfRange(str_list, i+1, str_list.length);
                }
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Programmers_62 sol = new Programmers_62();
        String[] str_list = {"r","u","d","d"};
        System.out.println(sol.solution(str_list));
    }
}


