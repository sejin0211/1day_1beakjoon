from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    
    # 선입선출
    truck_weights = deque(truck_weights)
    bridge = deque([])  # 덱으로 변경
    
    while 1:
        total = 0
        # 대기 트럭 & 다리를 건너는 트럭이 없으면 끝
        if not truck_weights and not bridge:
            break
        # 1초 추가
        answer += 1
        # 다리를 건너는 트럭이 있고,
        if bridge and bridge[0][1] >= bridge_length:
            print(bridge[0][1])
            bridge.popleft()  # 큐에서 popleft를 사용하여 첫 번째 트럭 제거
        if bridge:
            for i in range(len(bridge)):
                bridge[i][1] += 1
                total += bridge[i][0]
        if truck_weights and len(bridge) < bridge_length and total + truck_weights[0] <= weight:
            bridge.append([truck_weights.popleft(), 1])

    return answer