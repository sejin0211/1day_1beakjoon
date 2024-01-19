import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Boolean> hs = new HashMap<>();
        
        for(String phone : phone_book) {
            hs.put(phone, true);
        }
        
        // phone을 돌리자
        for(String phone : phone_book) {
            // phone에서 접두사 돌리자
            for(int i = 1; i < phone.length(); i++) {
                if(hs.containsKey(phone.substring(0, i))) {
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}