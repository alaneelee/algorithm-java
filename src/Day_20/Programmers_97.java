package Day_20;


import java.util.Arrays;

public class Programmers_97 {
    public int solution(String[] strArr) {
        int[] answer = new int[100000];
        for(int i = 0; i < strArr.length; i++) {
            answer[strArr[i].length()]++;
        }
        return Arrays.stream(answer).max().getAsInt();
    }

    public static void main(String[] args) {
        Programmers_97 sol = new Programmers_97();

        String[] strArr = {"a","bc","d","efg","hi"};

        System.out.println(sol.solution(strArr));
    }
}
