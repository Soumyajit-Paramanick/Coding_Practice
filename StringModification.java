import java.util.*;

public class StringModification {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = s.replaceAll("EF|G|56", "");
        System.out.println(ans);
    }
}
