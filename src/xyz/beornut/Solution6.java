package xyz.beornut;

import javafx.beans.binding.StringBinding;

public class Solution6 {
    public String convert(String s, int numRows) {
        int length = s.length();
        if(numRows < 2 || length < numRows){
            return s;
        }
        StringBuilder res = new StringBuilder();
        int p = 2 * numRows - 2;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j + i < length; j += p){
                res.append(s.charAt(j + i));
                if(j + p - i < length && i != 0 && i != numRows - 1){
                    res.append(s.charAt(j + p - i));
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution6().convert("PAYPALISHIRING", 3));
    }
}
