def solution(A,B):
    answer = 0
    A.sort()
    B.sort()
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    for i in range(len(A)):
        answer += A[i] * B[len(B)-1-i]

    return answer