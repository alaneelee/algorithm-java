package Day_06;

public class Programmers_28 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int index = 0; index < queries.length; index++) {
            int i = queries[index][0];
            int j = queries[index][1];
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Programmers_28 sol = new Programmers_28();
        int[] arr = {0, 1, 2, 3, 4 };
        int[][]queries = { { 0, 3 },{1, 2},{1, 4}};


        System.out.println(sol.solution(arr, queries));

    }
}