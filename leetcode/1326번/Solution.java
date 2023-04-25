class Solution {
    public int minTaps(int n, int[] ranges) {
        
        // 정원 전체에 물을 주기 위해 열려야 하는 최소의 수도꼭지 수
        int answer = 0;
        int[][] line = new int[n+1][2];

        for (int i = 0; i <= n; i++) {
            line[i][0] = Math.max(0,i - ranges[i]);
            line[i][1] = Math.min(n,i + ranges[i]);
        }
        
        int start = 0, end = 0, i = 0;
        Arrays.sort(line, (a,b) -> a[0] - b[0]);

        while (i <= n) {
            while (i <= n && line[i][0] <= start) {
                end = Math.max(end, line[i][1]);
                i++;
            }
            answer ++;
            if(start == end) return -1;
            if(end == n) return answer;
            start = end;
        }

        return answer;
    }
}