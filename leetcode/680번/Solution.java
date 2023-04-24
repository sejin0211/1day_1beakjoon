class Solution {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                String s1 = s.substring(left+1,right+1);
                String s2 = s.substring(left,right);
                if(!isPalindrome(s1) && !isPalindrome(s2)) return false;
                else break;
            }
            else{
                left++;
                right--;
            }
         }
        
        return true;    
    }
}