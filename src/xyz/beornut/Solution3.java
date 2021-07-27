package xyz.beornut;

import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        int left = 0;
        int max = 0;
        Character c;
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(characterIntegerHashMap.containsKey(c)){
                left = Math.max(left, characterIntegerHashMap.get(c) + 1);
            }
            characterIntegerHashMap.put(c , i);
            max = Math.max(max, i - left + 1);
        }
        return  max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int start = 0, len = 0, maxLen = 0, j;
        String substring, target;
        for(int i = 0; i < s.length(); i++){
            substring = s.substring(start, start + len);
            target = s.substring(i, i + 1);
            if(substring.contains(target)){
                j = substring.indexOf(target);
                start = start + j + 1;
                len = i - start + 1;
            }else{
                len++;
                if(len > maxLen){
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(new Solution3().lengthOfLongestSubstring("abba"));
    }
}
