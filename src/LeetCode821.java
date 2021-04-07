public class LeetCode821 {
    public int[] shortestToChar(String s, char c) {
        char[] chars = s.toCharArray();
        int[] res = new int[chars.length];
        //防止左边第一个不是c

        int dis = Integer.MAX_VALUE / 2;
        //左边遍历一次
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                dis = 0;
            }
            res[i] = dis++;
        }
        //防止右边第一个不是c
        dis = Integer.MAX_VALUE / 2;
        //右边遍历一次
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == c) {
                dis = 0;
            }
            res[i] = Math.min(res[i], dis++);
        }
        return res;
    }
}
