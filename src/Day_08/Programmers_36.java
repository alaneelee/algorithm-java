package Day_08;

public class Programmers_36 {
    public int solution(int a, int b, int c, int d) {
        int cnt = 0;
        if (a == b) { cnt += 1; }
        if (a == c) { cnt += 1; }
        if (a == d) { cnt += 1; }
        if (b == a) { cnt += 1; }
        if (b == c) { cnt += 1; }
        if (b == d) { cnt += 1; }
        if (c == a) { cnt += 1; }
        if (c == b) { cnt += 1; }
        if (c == d) { cnt += 1; }
        if (d == a) { cnt += 1; }
        if (d == b) { cnt += 1; }
        if (d == c) { cnt += 1; }

        if (cnt == 12) {
            return 1111 * a;
        }
        if (cnt == 6) {
            if (a == b) {
                if (b == c) { return (10 * a + d) * (10 * a + d); }
                else { return (10 * a + c) * (10 * a + c); }
            } else {
                if (a == c) { return (10 * a + b) * (10 * a + b); }
                else { return (10 * b + a) * (10 * b + a); }
            }
        }
        if (cnt == 4) {
            if (a == b) { return (a + c) * Math.abs(a-c); }
            if (a == c) { return (a + b) * Math.abs(a-b); }
            if (a == d) { return (a + b) * Math.abs(a-b); }
        }
        if (cnt == 2) {
            if (a == b) { return c * d; }
            if (a == c) { return b * d; }
            if (a == d) { return b * c; }
            if (b == c) { return a * d; }
            if (b == d) { return a * c; }
            if (c == d) { return a * b; }
        }
        int minAB = Math.min(a, b);
        int minCD = Math.min(c, d);
        return Math.min(minAB, minCD);
    }

    public static void main(String[] args) {
        Programmers_36 sol = new Programmers_36();

        System.out.println(sol.solution(2,2,2,2));
    }
}


