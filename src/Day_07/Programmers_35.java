package Day_07;

import java.util.ArrayList;

public class Programmers_35 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

    public static void main(String[] args) {
        Programmers_35 sol = new Programmers_35();

        System.out.println(sol.solution(true, false, false, false));
    }
}


