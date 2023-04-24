import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<Character, Integer> sH = new HashMap<>();
        for(char x : s.toCharArray()) {
            sH.put(x, sH.getOrDefault(x, 0) + 1);
        }
        for (char key : sH.keySet()){
            if(sH.get(key) == 1){
                answer += key;
            }
        }
        char[] tmp = answer.toCharArray();
        Arrays.sort(tmp);
        answer = String.valueOf(tmp);
        return answer;
    }
}