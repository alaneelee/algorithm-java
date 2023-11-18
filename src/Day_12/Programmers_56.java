package Day_12;

import java.util.ArrayList;
import java.util.List;

public class Programmers_56 {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Programmers_56 sol = new Programmers_56();
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        System.out.println(sol.solution(num_list));
    }
}

