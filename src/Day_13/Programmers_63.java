package Day_13;

import java.util.Arrays;

public class Programmers_63 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = Arrays.copyOfRange(num_list, 0, n);
        return answer;
    }


    public static void main(String[] args) {
        Programmers_63 sol = new Programmers_63();
        int[] num_list = {2,1,6};
        System.out.println(sol.solution(num_list, 1));
    }
}

