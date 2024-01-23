def solution(arr):
    answer = []
    for num in range(len(arr)):
# arr[num+1:num+2] 와 arr[num+1]은 같은 말이다.
# 하지만 arr[num+1]은 range가 벗어났을 때 오류가 나지만 arr[num+1:num+2]는 range가 벗어났을 때 빈 배열을 반환해준다.
        if [arr[num]] != arr[num+1:num+2]:
            answer.append(arr[num])
    return answer