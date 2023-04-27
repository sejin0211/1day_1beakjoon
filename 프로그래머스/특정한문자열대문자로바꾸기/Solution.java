class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        int n = my_string.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                sb.append(alp.toUpperCase());
                continue;
            }
            sb.append(my_string.charAt(i));
        }
        answer= sb.toString();
        return answer;
    }
}