package Day_13;

import java.util.Arrays;

public class Programmers_64 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i*n];
        }

        for (int i : answer) {
            System.out.println(i);
        }
        return answer;
    }


    public static void main(String[] args) {
        Programmers_64 sol = new Programmers_64();
        int[] num_list = {4,2,6,1,7,6};
        System.out.println(sol.solution(num_list, 4));
    }
}

