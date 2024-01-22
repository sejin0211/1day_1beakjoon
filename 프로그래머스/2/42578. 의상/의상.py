def solution(clothes):
    # 각 종류별로 1가지씩
    arr = {}
    answer = 1
    
    # 악세사리를 key value로 넣어줌
    # Dictionary를 사용하자
    # 종류 : 갯수
    
    for acc in clothes:
        key = acc[1]
        value = 1
        
        # 이미 종류가 들어가있으면 acc 추가해줌
        if key in arr:
            arr[key] += 1
        else: 
            arr[key] = 1
    
    # acc 종류의 갯수+1를 곱해줌
    for key in arr.keys() :
        answer *= arr[key] + 1
    
    print(arr)
    # 왜 한개씩 크지..?
    answer -= 1
    return answer