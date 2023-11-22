package Day_15;

public class Programmers_72 {
    public int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            while(num_list[i] > 1) {
                if(num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                    answer++;
                } else {
                    num_list[i]--;
                    if (num_list[i] == 1) {
                        break;
                    }
                    num_list[i] /= 2;
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_72 sol = new Programmers_72();
        int[] arr = {12, 4, 15, 1, 14};
        System.out.println(sol.solution(arr));
    }
}

//class Solution {
//    public int solution(int[] num_list) {
//        return Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() - 1).sum();
//    }
//}