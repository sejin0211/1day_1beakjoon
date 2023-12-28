import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        // 공부할꺼
        // bufferedReader와 bufferedWirter & Scanner 성능 차이
        // " "로 나뉠때 토큰을 써서 집어넣기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] wait = new int[N];
        int i = 0;
        int time = 0;

        String inputString = br.readLine();
        StringTokenizer inputStringTokenizer = new StringTokenizer(inputString, " ");
        
        while (inputStringTokenizer.hasMoreElements()) {
            wait[i] = Integer.parseInt(inputStringTokenizer.nextToken());
            i++;
        }
        Arrays.sort(wait);

        for (int k = 0; k < N; k++) {
            time += wait[k] * (N-k);
        }

        bw.write(time + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}