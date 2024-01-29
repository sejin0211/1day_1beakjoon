from collections import deque

def solution(priorities, location):
    answer = 0
    queue = deque([(p, i) for i, p in enumerate(priorities)])
    
    while queue:
        current = queue.popleft()
        
        if any(current[0] < q[0] for q in queue):
            queue.append(current)
        else:
            answer += 1
            if current[1] == location:
                break
    
    return answer