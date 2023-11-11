package Day_06;

public class Programmers_26 {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n+1];
        System.arraycopy(num_list, 0, answer, 0, n);
        if (num_list[n-1] > num_list[n-2]) {
            answer[n] = num_list[n-1] - num_list[n-2];
        } else {
            answer[n] = num_list[n-1] * 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_26 sol = new Programmers_26();
        int[] arr = {2,1,6};

        System.out.println(sol.solution(arr));
    }
}