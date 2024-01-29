from collections import Counter

def solution(participant, completion):
    # 각 선수의 참여 횟수를 세기
    participant_counter = Counter(participant)
    completion_counter = Counter(completion)

    # 참여자 배열에서 완주자 배열의 참여 횟수를 빼서 0이 아닌 선수 찾기
    answer = participant_counter - completion_counter

    # 0이 아닌 선수의 이름을 반환
    return list(answer.keys())[0]