import java.util.*;

public class Party {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] E = new int[t];
        int[] L = new int[t];
        for (int i = 0; i < t; i++) {
            E[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            L[i] = sc.nextInt();
        }
        int ans = calMax(t, E, L);
        System.out.println(ans);
    }

    public static int calMax(int t, int[] E, int[] L) {
        int previousPresent = 0;
        int maxPresent = 0;
        for (int i = 0; i < t; i++) {
            int currentPresent = previousPresent + E[i] - L[i];
            if (currentPresent < 0) {
                currentPresent = 0;
            }
            maxPresent = Math.max(maxPresent, currentPresent);
            previousPresent = currentPresent;
        }
        return maxPresent;
    }
}