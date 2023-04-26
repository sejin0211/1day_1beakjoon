import java.util.*;
import java.lang.*;
class Solution {
    public String solution(String input_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> cH = new HashMap<>();
        cH.put(input_string.charAt(0),1);
        
        for (int i = 1; i < input_string.length(); i++){
            if(input_string.charAt(i) != input_string.charAt(i-1)){
                cH.put(input_string.charAt(i), cH.getOrDefault(input_string.charAt(i), 0) + 1);
            }
        }
        
        for (char key : cH.keySet()){
            if(cH.get(key) >= 2){
                sb.append(key);
            }
        }
        
        answer = sb.toString();
        
        if (answer.equals("")) return "N";
        
        char[] tmp = answer.toCharArray();
        Arrays.sort(tmp);
        answer = String.valueOf(tmp);
    
        return answer;
    }
}