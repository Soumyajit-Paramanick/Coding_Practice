class Solution {
    static int octalToDecimal(int n) {

        int ans = 0;
        int power = 0;

        while (n != 0) {

            int digit = n % 10;

            ans = ans + digit * (int) Math.pow(8, power);

            power++;

            n = n / 10;
        }

        return ans;
    }
}