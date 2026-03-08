class Solution {
    static String octalToBinary(String octal) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < octal.length(); i++) {

            char ch = octal.charAt(i);

            if (ch == '0')
                ans.append("000");
            else if (ch == '1')
                ans.append("001");
            else if (ch == '2')
                ans.append("010");
            else if (ch == '3')
                ans.append("011");
            else if (ch == '4')
                ans.append("100");
            else if (ch == '5')
                ans.append("101");
            else if (ch == '6')
                ans.append("110");
            else if (ch == '7')
                ans.append("111");
        }

        return ans.toString();
    }
}