package Day_06;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Programmers_29 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        Arrays.fill(result, -1);
        ArrayList<Integer> candi = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            candi.clear();

            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    candi.add(arr[j]);
                }
            }
            if (candi.size() > 0) {
                result[i] = Collections.min(candi);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Programmers_29 sol = new Programmers_29();
        int[] arr = {0, 1,2,4,3};
        int[][]queries = { { 0, 4,2 },{0,3, 2},{0,2,2}};


        System.out.println(sol.solution(arr, queries));

    }
}