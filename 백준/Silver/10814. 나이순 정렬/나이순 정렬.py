# 백준 10814번
# 나이순 정렬

n = int(input())
sort_list = []
for i in range(n):
    key, value = map(str, input().split())
    key = int(key)
    sort_list.append((key, value))

# key값으로 정렬하기
# python은 기본적으로 stable 정렬
# 정렬할 때 같은 값이 나오면 먼저 들어온 순서대로 정렬
sort_list.sort(key= lambda x : x[0])

for i in sort_list:
    print(i[0], i[1])