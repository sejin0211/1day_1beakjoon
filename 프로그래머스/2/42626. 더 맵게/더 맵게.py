# def solution(scoville, K):
#     answer = 0
#     scoville.sort()
#     for i in range(len(scoville)-1):
#         if not scoville:
#             return -1
#         elif scoville[0] > K: 
#              break
#         else :
#             mix = scoville.pop(0) + scoville.pop(0) * 2
#             scoville.append(mix)
#             scoville.sort()
#             answer += 1

#     return answer

import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)

    while scoville[0] < K:
        if len(scoville) < 2:
            return -1

        mixed = heapq.heappop(scoville) + heapq.heappop(scoville) * 2
        heapq.heappush(scoville, mixed)
        answer += 1

    return answer