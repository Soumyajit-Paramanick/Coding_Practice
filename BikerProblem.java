import java.util.*;

public class BikerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Calculate(n, arr);
        System.out.println(ans);
    }

    public static int Calculate(int n, int[] arr) {
        int ziroCount = 0;
        int pair = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ziroCount++;
            } else {
                pair = pair + ziroCount;
            }
        }
        return pair;
    }
}
