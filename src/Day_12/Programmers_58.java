package Day_12;

public class Programmers_58 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == 2) {
                index1 = i;
                break;
            }
        }

        if (index1 < 0 || index1 == arr.length -1) {
            answer = new int[1];
            answer[0] = index1;
            System.out.println(answer[0]);
            return answer;
        }

        for (int i = index1 + 1; i<arr.length; i++) {
            if (arr[i] == 2) {
                index2 = i;
            }
        }

        if (index2 < 0) {
            answer = new int[1];
            answer[0] = arr[index1];
            System.out.println(answer[0]);
            return answer;
        }

        answer = new int[index2-index1+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i+index1];
            System.out.println(answer[i]);
        }

        return answer;
    }


    public static void main(String[] args) {
        Programmers_58 sol = new Programmers_58();
        int[] arr = {1,2,1,2,1,10,2,1};
        System.out.println(sol.solution(arr));
    }
}

