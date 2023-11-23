package Day_17;

public class Programmers_81 {
    public int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            if (myString.substring(i, i+pat.length()).equals(pat)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_81 sol = new Programmers_81();

        System.out.println(sol.solution("banana", "ana"));
    }
}