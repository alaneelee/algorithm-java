package Day_11;

import java.util.ArrayList;

public class Programmers_51 {
    public int[] solution(int n, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = k; i <= n; i+=k) {
            nums.add(i);
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        Programmers_51 sol = new Programmers_51();
        System.out.println(sol.solution(10, 3));
    }
}

