# 배열의 갯수 받기
n = int(input())
# 배열 집어넣기
nums = list(map(int, input().split()))

# 배열이 1000까지니까 1001 넣어주기
dp = [1001]

for i in nums:
    # 내림차순으로 dp에 넣어주기
    if dp[-1] > i:
        dp.append(i)
        continue
    # i가 dp 최솟값보다 크다면?
    for j in range(len(dp)-2, -1, -1):
        if dp[j] > i:
            dp[j+1] = i
            break
            
print(len(dp)-1)