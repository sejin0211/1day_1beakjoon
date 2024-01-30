def solution(s):
    answer = 0
    stk = []
    s = list(s.split())
    for i in s:
        if i == 'Z':
            stk.pop()
        else :
            stk.append(i)
    for i in stk:
        answer += int(i)
    return answer