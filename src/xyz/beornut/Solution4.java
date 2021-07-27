package xyz.beornut;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int idx = (nums1.length + nums2.length) / 2 + 1;
        int mod = (nums1.length + nums2.length) % 2;
        int cursor1 = 0, cursor2 = 0;
        int ans = nums1.length > 0 ? nums1[0] : nums2[0], last = ans;
        for(int i = 0; i < idx; i++){
            last = ans;
            if(cursor1 >= nums1.length){
                ans = nums2[cursor2++];
            }else if(cursor2 >= nums2.length){
                ans = nums1[cursor1++];
            }else{
                ans = nums1[cursor1] <= nums2[cursor2] ? nums1[cursor1++] : nums2[cursor2++];
            }
        }
        if(mod == 0)
            return (ans + last) / 2.0;
        else
            return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution4().findMedianSortedArrays(new int[]{1, 4, 5, 6}, new int[]{1, 2, 3}));
    }
}
