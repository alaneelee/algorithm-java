package Day_07;

import java.util.ArrayList;

public class Programmers_32 {
    public ArrayList<Integer> solution(int start_num, int end_num) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            answer.add(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_32 sol = new Programmers_32();
        System.out.println(sol.solution(3, 10));
    }
}