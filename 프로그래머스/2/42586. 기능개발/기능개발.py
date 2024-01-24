def solution(progresses, speeds):
    # 순서 상관없이 기능개발
    # progresses는 먼저 배포 순서대로, 작업의 진도
    # speeds : 각 작업의 개발속도
    # 배포는 하루에 한 번 
    answer = []
    remain_arr = []
    
    for i in range(len(progresses)):
        cnt = 0
        remain = 100 - progresses[i]
        
        if remain % speeds[i] == 0:
            cnt = remain // speeds[i]
        else:
            cnt = remain // speeds[i] + 1
        remain_arr.append(cnt)
        
    max = remain_arr[0]
    cnt = 1
    print(remain_arr)
    
    for day in remain_arr[1:]:
        if max >= day: cnt += 1
        else:
            answer.append(cnt)
            max = day
            cnt = 1
    answer.append(cnt)
    
    return answer
