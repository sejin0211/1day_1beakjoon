def bfs(cut, n, gra):
    #방문정보세팅
    visit = [0 for i in range(n+1)]
    #방문순서
    cnt = 1
    #시작값
    visit[cut[0]] = cnt
    #반대되는 자리도 방문처리(진행하고 싶지 않아서(cut))
    visit[cut[1]] = cnt
    
    q = []
    q.append(cut[0])
    
    while q:
        x = q.pop(0)
        #x에 연결된 그래프 데이터
        for i in gra[x]:
            #방문x
            if visit[i] == 0:
                cnt += 1
                visit[i] = cnt
                q.append(i)
                
    return cnt
                
def solution(n, wires):
    answer = n
    
    #그래프 정보로 생성
    gra = [[]for i in range(n+1)]
    for i, j in wires:
        gra[i].append(j)
        gra[j].append(i)
        
    #각각의 모든 위치에서 BFS를 실행
    for i in wires:
        cnt = bfs(i,n,gra) # 3
        
        answer = min(answer, abs((n-cnt) - cnt))
        
    return answer