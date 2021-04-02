import jdk.jfr.StackTrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class let_test {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        Scanner scan1 = new Scanner(System.in);
//        int s2 = scan1.nextInt();
//        System.out.println(s2);
        List<Integer> list = new ArrayList<>();
       list.add(scan.nextInt());

        //int[] array = (int[])list.toArray(new int[list.size()]);
            //System.out.println(array[0]);
        //System.out.println(t1((int[]) list.toArray(new int[list.size()])));

    }
    public static int t1(int[] nums){
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
