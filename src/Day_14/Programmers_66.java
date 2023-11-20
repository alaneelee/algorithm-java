package Day_14;

public class Programmers_66 {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[i * 5];
            System.out.println(answer[i]);
        }

        return answer;
    }


    public static void main(String[] args) {
        Programmers_66 sol = new Programmers_66();
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(sol.solution(names));
    }
}

