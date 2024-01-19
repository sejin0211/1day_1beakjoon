import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int max = nums.length/2;
        HashSet<Integer> hs = new HashSet<>();
        // 폰켓몬 종류 추가
        for(int num : nums) hs.add(num);
        
        // max와 HashSet 사이즈 중 작은 거는?
        answer = Math.min(hs.size(), max);
        
        return answer;
    }
}