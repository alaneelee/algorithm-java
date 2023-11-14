package Day_08;

public class Programmers_39 {
    public String solution(String my_string, int[][] queries) {

        for (int[] query : queries) {
            my_string = reverSubstring(my_string, query[0], query[1]);
        }

        return my_string;
    }

    public String reverSubstring(String str, int s, int e) {
        StringBuilder reversedBuilder = new StringBuilder(str.substring(s, e + 1)).reverse();
        StringBuilder resultBuilder = new StringBuilder(str);
        resultBuilder.replace(s, e + 1, reversedBuilder.toString());
        return resultBuilder.toString();
    }


    public static void main(String[] args) {
        Programmers_39 sol = new Programmers_39();
        int[][] queries = {{2, 3},{0, 7},{5, 9},{6, 10}};
        System.out.println(sol.solution("rermgorpsam",queries));
    }
}




//
//class Solution {
//
//    char[] arr;
//
//    public String solution(String my_string, int[][] queries) {
//
//        arr = my_string.toCharArray();
//
//        for (int[] query : queries) {
//            reverse(query[0], query[1]);
//        }
//
//        return new String(arr);
//    }
//
//    private void reverse(int s, int e) {
//        while (s < e) {
//            char temp = arr[s];
//            arr[s++] = arr[e];
//            arr[e--] = temp;
//        }
//    }
//}