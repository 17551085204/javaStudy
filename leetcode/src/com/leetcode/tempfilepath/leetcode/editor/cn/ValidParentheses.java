//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串 
// 👍 1991 👎 0

package com.leetcode.tempfilepath.leetcode.editor.cn;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        System.out.println(solution.isValid("{}"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        // 判断括号是否有效
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='('||chars[i]=='['||chars[i]=='{'){
                characters.push(chars[i]);
            }else{
                if(!characters.isEmpty()){
                    String str=""+characters.pop()+chars[i];
                    if(!(str.equals("()")||str.equals("[]")||str.equals("{}"))){
                        return false;
                    }
                }else{
                    return false;
                }

            }
        }
        return characters.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}