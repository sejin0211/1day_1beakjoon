def solution(angle):
    if(0 < angle & angle < 90 ) : answer = 1
    elif(angle == 90) : answer = 2
    elif(90 < angle & angle < 180 ) : answer = 3
    else : answer = 4
    
    return answer