import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 계획
        // 거스름돈 change를 5로 나눔
        // 안나뉘면 2를 뺌

        Scanner scan = new Scanner(System.in);
        int change = scan.nextInt();
        int count = 0;

        while (change > 0) {
            if(change % 5 == 0) {
                count += change / 5;
                break;
            }
            change -= 2;
            count++;
        }

        if (change < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }

    }
}