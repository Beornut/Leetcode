package xyz.beornut;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        for(int i = arrayList.size() - 1; i > 0; i--){
            int j = arrayList.indexOf(target - arrayList.get(i));
            if(j > -1 && i != j){
                return new int[]{i, j};
            }
        }
        return res;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(nums[0], 0);
        for(int i = 1; i < nums.length; i++){
            int num = target - nums[i];
            if(hashMap.containsKey(num)){
                return new int[]{hashMap.get(num), i};
            }else{
                hashMap.put(nums[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum2(nums, 6)));
    }
}
