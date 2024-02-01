def solution(tickets):
    answer = []
    # 정렬 / 같은 위치 출발이 있다면 - 알파벳 순으로 진행
    tickets.sort()
    
    q = []
    # 여행경로, 남아있는 티켓
    q.append([["ICN"],tickets])
    while q:
        now, t = q.pop(0)
        if len(t) == 0:
            answer = now
            break
        # 출발지에 대한 티켓을 찾기
        for i in range(len(t)):
            if t[i][0] == now[-1]:
                now.append(t[i][1])
                t.pop(i)
                break
        t.sort()
        q.append([now, t])
        
    
    return answer