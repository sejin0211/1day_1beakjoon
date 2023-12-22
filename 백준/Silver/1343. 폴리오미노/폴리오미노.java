import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // 계획
        // input을 읽어온다
        // A인지 .인지 개수를 카운트 한다.
        // A이면 count를 한개씩 올린다.
        // count가 4이상이면 AAAA로 바꿈 count 초기화
        // count가 4로 안나눠짐 && count가 2로 나눠짐 && temp[i+1]이 A가 아닐 떄 BB로 바꿈 count 초기화
        // count가 홀수이면 flag = false; break; 아니면 .을 추가해줌,

        // flag가 false 이거나 count가 1일때 -1 출력
        // 아니면 저장해둔 배열 출력

        String input = scan.next();
        int count = 0;
        int countX = 0;
        int num = 0;
        boolean flag = true;

        String[] arr = new String[500];
        String[] temp = new String[500];

        for(int i = 0; i < input.length(); i++) {
            temp[i] = String.valueOf(input.charAt(i));
            if (String.valueOf(input.charAt(i)).equals("X")) {
                countX++;
            }
            if (i == input.length()-1) {
                temp[i+1] = "Z";
            }
        }

        if(countX % 2 != 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            if (String.valueOf(input.charAt(i)).equals("X")){
                count++;
                if(count % 4 == 0) {
                    arr[num] = "AAAA";
                    num++;
                    count = 0;
                } else if (count % 2 == 0 && !temp[i+1].equals("X")) {
                    arr[num] = "BB";
                    num++;
                    count = 0;
                }
            } else {
                if(count % 2 != 0) {
                    flag = false;
                    break;
                } else {
                    arr[num] = ".";
                    num++;
                }
            }
        }
        if (!flag || count == 1) {
            System.out.println(-1);
        }else {
            for(int i = 0; i < num; i++) {
                System.out.print(arr[i]);
            }
        }
    }}