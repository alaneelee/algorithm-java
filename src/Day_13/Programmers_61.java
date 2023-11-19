package Day_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_61 {
    public int[] solution(int[] num_list, int n) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = n; i< num_list.length; i++) {
            nums.add(num_list[i]);
        }

        for (int i=0; i<n; i++) {
            nums.add(num_list[i]);
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        Programmers_61 sol = new Programmers_61();
        int[] num_list = {5,2,1,7,5};
        System.out.println(sol.solution(num_list, 3));
    }
}

