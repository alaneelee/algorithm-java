package Day_10;

public class Programmers_50 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char c : my_string.toCharArray()) {
            if (c >= 'a') { answer[c - 'a' + 26]++; }
            else { answer[c - 'A']++; }
        }
        return answer;
    }


    public static void main(String[] args) {
        Programmers_50 sol = new Programmers_50();
        System.out.println(sol.solution("Programmers"));
    }
}

