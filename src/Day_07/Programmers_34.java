package Day_07;

import java.util.ArrayList;
import java.util.Stack;

public class Programmers_34 {
    public int[] solution(int[] arr) {
        int[] stk = {};
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            if(result.isEmpty()) {
                result.add(arr[i]);
                i++;
                continue;
            }
            int last = result.size() - 1;
            if(result.get(last) < arr[i]) {
                result.add(arr[i]);
                i++;
            } else {
                result.remove(last);
            }
        }

        stk = result.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }

    public static void main(String[] args) {
        Programmers_34 sol = new Programmers_34();
        int[] arr = {1,4,2,5,3};
        System.out.println(sol.solution(arr));
    }
}


//import java.util.*;
//
//class Solution {
//    public Stack<Integer> solution(int[] arr) {
//        Stack<Integer> stack = new Stack<>();
//        int i = 0;
//
//        while (i < arr.length) {
//            if (stack.empty() || stack.peek() < arr[i]) {
//                stack.push(arr[i]);
//                i++;
//            } else if (stack.peek() >= arr[i]) {
//                stack.pop();
//            }
//        }
//        return stack;
//    }
//}