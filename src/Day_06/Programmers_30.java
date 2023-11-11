package Day_06;

import java.util.Arrays;

public class Programmers_30 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    result[j] += 1;
                }
            }
        }
        for (int num : result) {
            System.out.println(num);
        }
        return result;
    }

    public static void main(String[] args) {
        Programmers_30 sol = new Programmers_30();
        int[] arr = {0, 1,2,4,3};
        int[][]queries = { { 0, 4,1 },{0,3, 2},{0,3,3}};


        System.out.println(sol.solution(arr, queries));

    }
}