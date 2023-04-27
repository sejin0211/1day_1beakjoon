class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int n = myString.length();
        int m = pat.length();
        for (int i = 0; i <= n-m; i++) {
            if(myString.substring(i,i+m).equals(pat))
            answer++;
        }
        return answer;
    }
}