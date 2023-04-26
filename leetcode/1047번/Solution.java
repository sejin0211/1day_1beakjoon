class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(); 
        Stack<Character> stack = new Stack<Character>();

        for (char x : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == x) {
                stack.pop();
            } else {
                stack.push(x);
            }
        }

        for (char x : stack) sb.append(x);
    
        return sb.toString();
    }
}