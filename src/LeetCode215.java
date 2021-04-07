import java.util.Arrays;

public class LeetCode215 {
    public int findKthLarget(int[] nums,int k){

        Arrays.sort(nums);
        return nums[nums.length-k+1];
    }
}
