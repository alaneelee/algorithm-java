package Day_12;

public class Programmers_57 {
    public int[] solution(int[] arr, int[][] intervals) {
        int len = 0;
        for (int[] interval : intervals) {
            len += interval[1] - interval[0] + 1;
        }
        int[] answer = new int[len];
        int i = 0;
        while(i < len) {
            for (int[] interval : intervals) {
                for (int j = interval[0]; j <= interval[1]; j++) {
                    answer[i] = arr[j];
                    i++;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Programmers_57 sol = new Programmers_57();
        int[] arr = {1,2,3,4,5};
        int[][] intervals = {{1,3},{0,4}};
        System.out.println(sol.solution(arr,intervals));
    }
}

