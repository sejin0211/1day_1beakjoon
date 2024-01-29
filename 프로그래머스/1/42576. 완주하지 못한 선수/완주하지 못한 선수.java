import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        for(String runner : participant) hm.put(runner, hm.getOrDefault(runner,0) + 1);
        for(String runner : completion) hm.put(runner, hm.get(runner) -1);
        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}