package nineteen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class SecondSolution {

    public static void main(String[] args) {
        Scanner in = createScaner();

        int testCases;

        testCases = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= testCases; i++) {
            in.nextInt();
            in.nextLine();
            String directions = in.nextLine();
            solve(i, directions);
        }
    }

    private static void solve(int testCase, String directions) {
        StringBuilder sb = new StringBuilder();

        for (char c : directions.toCharArray()) {
            if (c == 'S') {
                sb.append("E");
            } else {
                sb.append("S");
            }
        }

        System.out.println("Case #" + testCase + ": " + sb.toString());
    }

    public static Scanner createScaner() {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        return sc;
    }
}
