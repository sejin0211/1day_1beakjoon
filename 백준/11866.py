# 백준 11866번 
# 요세푸스 문제 0
import sys
from collections import deque

# n, k 입력받기
n, k = map(int, input().split())

# 사람 넣기
circle = [ i for i in range(1, n+1)]
d = deque(circle)

#출력용 배열
answer = []

# d가 비어있을 때까지
while d:    
    d.rotate(-k)
    num = d.pop()
    answer.append(num)

print("<" + str(answer)[1:-1] + ">")