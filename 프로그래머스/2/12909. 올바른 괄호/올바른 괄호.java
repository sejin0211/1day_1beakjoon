import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
        
        for(char x : s.toCharArray()) {
            if( x == '(') {
                stack.push(x);
            }
            else if ( x == ')' ) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;

        return answer;
    }
}