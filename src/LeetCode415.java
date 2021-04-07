public class LeetCode415 {
    public static void main(String[] args) {
        String a = "11";
        String b = "123";
        System.out.println(addString(a,b));
    }
    public static String addString(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int sum = 0;
        int carry = 0;
        while (l1 >= 0 || l2 >= 0) {
            int x = l1 >= 0 ? num1.charAt(l1) - '0' : 0;
            int y = l2 >= 0 ? num2.charAt(l2) - '0' : 0;
            sum = x + y + carry;
            result.append(sum % 10);
            carry = sum / 10;
            l1--;
            l2--;
        }
        if(carry !=0 ){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
