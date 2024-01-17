class Solution {
    public int solution(String word) {
        int answer = 0;
        
        // 모음 기본 배열 
        String[] vowel = {"A", "E", "I", "O", "U"};
        String tmp = "";
        
        // 한문자씩 계속 추가해준다
        for(int i = 0; i < 5; i++) {
            tmp = vowel[i];
            answer++;
            if (tmp.equals(word)) return answer;

            for(int j = 0; j < 5; j++) {
                tmp = vowel[i] + vowel[j];
                answer++;
                if (tmp.equals(word)) return answer;

                for(int k = 0; k < 5; k++) {
                    tmp = vowel[i] + vowel[j] + vowel[k];
                    answer++;
                    if (tmp.equals(word)) return answer;

                    for(int m = 0; m < 5; m++) {
                        tmp = vowel[i] + vowel[j] + vowel[k] + vowel[m];
                        answer++;
                        if (tmp.equals(word)) return answer;

                        for(int n = 0; n < 5; n++) {
                            tmp = vowel[i] + vowel[j] + vowel[k] + vowel[m] + vowel[n];
                            answer++;
                            if (tmp.equals(word)) return answer;
                        }
                    }
                }
            }
        }

        return answer;
    }
}