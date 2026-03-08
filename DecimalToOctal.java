class Solution {
    static String decToOctal(int n) {

        if(n == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while(n != 0){
            sb.append(n % 8);
            n = n / 8;
        }

        return sb.reverse().toString();
    }
}