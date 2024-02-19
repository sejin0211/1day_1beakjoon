from collections import deque
def solution(maps):
    n = len(maps)
    m = len(maps[0])
                # 오 왼 아래 위
    directions = [(0,1),(0,-1),(1,0),(-1,0)]
    
    # 시작점 0,0 거리 1
    queue = deque([[0, 0, 1]])

    # 방문여부 저장
    visited = [[False] * m for _ in range(n)]
    
    while queue:
        # 큐에서 하나 팝
        row, col, distance = queue.popleft()
        # 상대 진영에 도착
        if row == n -1 and col == m - 1:
            return distance
        
        for direction in directions:
            nr = row + direction[0]
            nc = col + direction[1]
            
            if 0 <= nr < n and 0 <= nc < m and maps[nr][nc] == 1 and not visited[nr][nc]:
                visited[nr][nc] = True
                queue.append([nr, nc, distance + 1])
    
    return -1