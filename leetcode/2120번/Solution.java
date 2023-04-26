class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int answer[] = new int[s.length()];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int[] dir = {'U', 'R', 'D', 'L'};
        int nx = 0, ny = 0;

        for(int i = 0; i < s.length(); i++){
            int x = startPos[0];
            int y = startPos[1];
            int cnt = 0;
            for(int j = i; j < s.length(); j++){
                for(int k = 0; k < 4; k++){
                    if(s.charAt(j) == dir[k]){
                        nx = x + dx[k];
                        ny = y + dy[k];
                    }
                }
                if(nx < 0 || nx >= n || ny < 0 || ny >= n) break;
                cnt++;
                x = nx;
                y = ny;
            }
            answer[i] = cnt;
        }

        return answer;
    }
}