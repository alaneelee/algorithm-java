package Day_05;

public class Programmers_22 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            answer += included[i] ? a + d * i : 0;
        }
        return answer;

        // return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
    }

    public static void main(String[] args) {
        Programmers_22 sol = new Programmers_22();
        boolean[] arr = {true, false, false, true, true};

        System.out.println(sol.solution(3, 4, arr));
    }
}