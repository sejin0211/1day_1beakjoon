def solution(n, computers):
    answer = 0
    visited = [False] * n
    # DFS 사용
    def dfs(i):
        visited[i] = True
        for side in range(n):
            if visited[side] == False and computers[i][side] == 1:
                dfs(side)

    for i in range(n):
        if visited[i] == False:
            answer += 1
            dfs(i)

    return answer