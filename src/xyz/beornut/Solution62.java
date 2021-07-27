package xyz.beornut;

import java.math.BigInteger;
import java.util.HashMap;

public class Solution62 {
    HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();

    public int uniquePaths(int m, int n) {
        if(m <= 1 || n <= 1)
            return 1;
        BigInteger res = new BigInteger("1");
        for(int i = m + n - 2; i >= m; i--){
            res = res.multiply(new BigInteger(i + ""));
        }
        for(int i = n - 1; i > 0; i--){
            res = res.divide(new BigInteger(i + ""));
        }
        return res.intValue();
    }

    public int uniquePaths_2(int m, int n) {
        if(m <= 1 || n <= 1)
            return 1;
        else{
            return  find(m - 1, n) + find(m, n - 1);
        }
    }

    public int find(int m, int n){
        int res;
        if(stringIntegerHashMap.containsKey(m + " " + n)){
            res = stringIntegerHashMap.get(m + " " + n);
        }else if(stringIntegerHashMap.containsKey(n + " " + m)){
            res = stringIntegerHashMap.get(n + " " + m);
        }else{
            res = uniquePaths_2(m, n);
            stringIntegerHashMap.put(m + " " + n, res);
        }
        return res;
    }

    public int uniquePaths_3(int m, int n) {
        long res = 1;
        for(int i = m, j = 1; j < n; i++, j++){
            res = res * i / j;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution62().uniquePaths_3(13, 23));
    }
}
