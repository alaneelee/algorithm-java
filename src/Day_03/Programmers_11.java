package Day_03;

import java.util.Scanner;

public class Programmers_11 {
    public String solution(String str1, String str2) {
        String answer = "";
        int maxLength = Math.max(str1.length(), str2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<maxLength; i++) {
            if (i < str1.length()) {
                sb.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                sb.append(str2.charAt(i));
            }
        }
//        for(int i = 0; i < str1.length(); i++){
//            answer+= str1.charAt(i);
//            answer+= str2.charAt(i);
//        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Programmers_11 sol = new Programmers_11();
        System.out.println(sol.solution("aaaaa","bbbbb"));
    }
}