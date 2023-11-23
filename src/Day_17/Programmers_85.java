package Day_17;

import java.util.Arrays;

public class Programmers_85 {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        int cnt = 0;

        if (myString.charAt(myString.length()-1) == 'x') {
            cnt++;
        }

        int[] answer = new int[arr.length+cnt];

        System.out.println(answer.length);

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
            System.out.println(answer[i]);
        }

        if (cnt == 1) {
            answer[answer.length-1] = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_85 sol = new Programmers_85();
        String[] strArr = {"and","notad","abcd"};

        System.out.println(sol.solution("oxooxoxxox"));
    }
}


//    public int[] solution(String myString) {
//
//        return Arrays.stream(myString.split("x", myString.length()))
//            .mapToInt(x -> x.length())
//            .toArray();
//    }