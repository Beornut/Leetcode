package xyz.beornut;

public class Solution5 {
    public String longestPalindrome(String s) {
        String ans = "";
        int len = s.length();
        for(int i = 0; i < len; i++){
            int j = 1;
            while (i - j >= 0 && i + j < len && s.charAt(i - j) == s.charAt(i + j))
                j++;
            String cur1 = s.substring(i - j + 1, i + j);
            if(cur1.length() > ans.length())
                ans = cur1;

            int k = 1;
            while (i - k + 1 >= 0 && i + k < len && s.charAt(i - k + 1) == s.charAt(i + k))
                k++;
            if(k > 1){
                String cur2 = s.substring(i - k + 2, i + k);
                if(cur2.length() > ans.length())
                    ans = cur2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution5().longestPalindrome("abbc"));
    }
}
