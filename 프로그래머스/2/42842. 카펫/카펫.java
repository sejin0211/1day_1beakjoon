class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        for(int y = 1; y <= sum; y++) {
            if(sum % y == 0) {
                int x = sum / y;
                
                int brownNum = 2*x + 2*y - 4;
                if (brownNum == brown) {
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
        }
        
        return answer;
    }
}