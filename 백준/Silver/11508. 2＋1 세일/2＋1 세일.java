import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        // 계획
        // 배열에 저장시키고 내림차순으로 정렬 -> 값  구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Integer[] cost = new Integer[N];

        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(cost, Collections.reverseOrder()); // 내림차순 정렬

        Long money = 0L;

        for (int i = 0; i < N; i++) {
            if( (i+1)%3 != 0) money += cost[i];
        }

        bw.write(money + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}