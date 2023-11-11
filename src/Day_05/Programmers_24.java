package Day_05;

import java.util.Arrays;

public class Programmers_24 {
    public int solution(int[] num_list) {
        int mul = 1;
        double square = Math.pow(Arrays.stream(num_list).sum(), 2);
        for (int num : num_list) {
            mul *= num;
        }

        return mul < square ? 1 : 0;
    }

    public static void main(String[] args) {
        Programmers_24 sol = new Programmers_24();
        int[] arr = {5,7,8,3};

        System.out.println(sol.solution(arr));
    }
}