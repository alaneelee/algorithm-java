package Day_16;

public class Programmers_77 {
    public String[] solution(String[] strArr) {

        for (int i = 0; i<strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }

        return strArr;
    }

    public static void main(String[] args) {
        Programmers_77 sol = new Programmers_77();
        String[] strArr = {"AAA","BBB","CCC","DDD"};
        System.out.println(sol.solution(strArr));
    }
}