public class Q3 {
    public static int main(int[] nums) {
        //创建一个索引i
        int i = 0;
        while(i < nums.length){
            //我们的目标是让nums[i]=i，这样如果有重复的就一目了然
            if(nums[i] == i){
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;

    }
}
