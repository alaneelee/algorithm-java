package Day_12;

import java.util.Arrays;

public class Programmers_60 {
    public int[] solution(int[] num_list, int n) {

        return Arrays.copyOfRange(num_list, n-1, num_list.length);

    }


    public static void main(String[] args) {
        Programmers_60 sol = new Programmers_60();
        int[] num_list = {5,2,1,7,5};
        System.out.println(sol.solution(num_list, 2));
    }
}

