//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。
// 请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学 
// 👍 2354 👎 0

package com.leetcode.tempfilepath.leetcode.editor.cn;

public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
        System.out.println(solution.reverse(-123));

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int reverse(int x) {
       int res=0;// 保存最后返回的结果
        // 不需要判断n的正负
        while(x!=0){
            int pop=x%10; // 获取x的每一位数
            x/=10;
            // 需要考虑到数值的范围
            /********/
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && pop < -8)) return 0;


            res=res*10+pop;
        }

        return res;

    }

    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}