package Day_11;

public class Programmers_54 {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for(int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Programmers_54 sol = new Programmers_54();
        int[] arr = {0,0,0,1};
        System.out.println(sol.solution(arr, 1));
    }
}

