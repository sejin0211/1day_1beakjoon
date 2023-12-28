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
        Integer[] tip = new Integer[N];

        for (int i = 0; i < N; i++) {
            tip[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(tip, Collections.reverseOrder()); // 내림차순 정렬

        Long max = 0L;

        for (int i = 0; i < N; i++) {
            if( tip[i] - i > 0) max += tip[i] - i;
        }

        bw.write(max + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}