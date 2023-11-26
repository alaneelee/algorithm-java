package Day_20;


import java.util.Arrays;

public class Programmers_98 {
    public int[] solution(int[] arr, int n) {

        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i+=2) {
                arr[i] += n;
            }
        } else {
            for (int i = 1; i < arr.length; i+=2) {
                arr[i] += n;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Programmers_98 sol = new Programmers_98();

        int[] arr = {49, 12, 100, 276, 33};

        System.out.println(sol.solution(arr, 27));
    }
}
