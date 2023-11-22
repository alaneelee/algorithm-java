package Day_15;

import java.util.Arrays;

public class Programmers_73 {
    public int solution(int[] num_list) {
        return num_list.length >= 11 ? Arrays.stream(num_list).sum() : Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        Programmers_73 sol = new Programmers_73();
        int[] arr = {2, 3, 4, 5};
        System.out.println(sol.solution(arr));
    }
}