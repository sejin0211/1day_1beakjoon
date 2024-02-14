def solution(numbers, target):
    answer = 0
    
    def dfs(num, depth):
        # 외부함수의 지역변수를 참조하기 위해 사용
        nonlocal answer
        # num이 target을 넘어가도 뒤에서 -를 해줄 수 있으니 오류
        # if num > target:
        #     return
        # 깊이가 numbers이면 끝
        if depth == len(numbers):
            if num == target:
                answer += 1
            return
        # 재귀함수
        dfs(num + numbers[depth], depth + 1)
        dfs(num - numbers[depth], depth + 1)
    
    dfs(0,0)
    return answer