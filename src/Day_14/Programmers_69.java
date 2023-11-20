package Day_14;

import java.util.ArrayList;
import java.util.List;

public class Programmers_69 {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            for (int i = s; i <= e; i++) {
                arr[i] += 1;
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        Programmers_69 sol = new Programmers_69();
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,1}, {1,2}, {2,3}};
        System.out.println(sol.solution(arr, queries));
    }
}

