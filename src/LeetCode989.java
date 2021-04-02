import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

class LeetCode989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int n = A.length;
        List<Integer> res = new ArrayList<>();
        int i = n - 1, sum = 0, carry = 0;
        while (i >= 0 || K != 0) {
            int x = i >= 0 ? A[i] : 0;
            int y = K != 0 ? K % 10 : 0;

            sum = x + y + carry;
            carry = sum / 10;
            K = K / 10;
            i--;
            res.add(sum % 10);
        }
        if (carry != 0) res.add(carry);
        //翻转链表
        Collections.reverse(res);
        return res;
    }
}
