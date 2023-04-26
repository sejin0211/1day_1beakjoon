class Solution {
    public int[] solution(String command) {
        int[] answer = {};
                // 북,동,남,서
        int dx[] = {0,1,0,-1};
        int dy[] = {1,0,-1,0};
        
        int x=0, y=0, d=0;
        
        for (char c : command.toCharArray()) {
            if (c == 'R') {
                d = (d+1) % 4;
            } else if (c == 'L') {
                d = (d+3) % 4;
            } else if (c == 'G') {
                x += dx[d];
                y += dy[d];
            } else if (c == 'B') {
                x -= dx[d];
                y -= dy[d];
            }
        }
        
        
        return new int[]{x,y};
    }
}