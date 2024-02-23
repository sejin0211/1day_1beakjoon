def solution(N, number):
    answer = 0
    # 8개의 set이 만들어지도록 초기화
    # s에는 8 번 사용해서 담길 수 있는 수들의 집합이 담긴다
    s = [set() for x in range(8)]  
    
    # N과 number가 같은 경우
    if N == number:  
    	return 1
    
    # ex) 빈집합, 5, 55, 555 ... 이렇게 넣어줌
    for i, x in enumerate(s, start=1):
        x.add(int(str(N)*i))
    
    # s집합을 돈다
    for i in range(1, 8):
        
        for j in range(i):
            for op1 in s[j]:
                for op2 in s[i-j-1]:
                    s[i].add(op1 + op2)
                    s[i].add(op1 - op2)
                    s[i].add(op1 * op2)
                    # op2가 0인 경우 division error 발생
                    if op2 != 0:
                        s[i].add(op1 // op2) 
                        
        # 그때그때 확인을 하면 연산이 단순할 수도 있겠지만 이렇게 list를 확인하는 것이 코드가 깔끔함
        if number in s[i]:  
            answer = i + 1
            
            return answer

    return -1