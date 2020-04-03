package nineteen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class ThirdSolution {

    public static void main(String[] args) {
        Scanner in = createScaner();

        int testCases;

        testCases = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= testCases; i++) {
            String firstLine = in.nextLine();
            int N = Integer.parseInt(firstLine.split(" ")[0]);
            int L = Integer.parseInt(firstLine.split(" ")[1]);
            String numStr = in.nextLine();
            int[] numArr = Arrays.stream(numStr.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] primesArr = getPrimes(N);
            solve(i, N, L, numArr, primesArr);
        }
    }

    private static void solve(int testCase, int N, int L, int[] numArr, int[] primeArr) {
        StringBuilder sb = new StringBuilder();
        int firstNum = numArr[0];

        System.out.println("Case #" + testCase + ": " + sb.toString());
    }

    public static Scanner createScaner() {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        return sc;
    }

    public static int[] getPrimes(int N) {
        int[] arr = new int[26];
        int j = 0;
        for (int i = 3; i <= N; i++) {
            if (isPrime(i)) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }

    public static boolean isPrime(int n) {
        if (n <= 2) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
