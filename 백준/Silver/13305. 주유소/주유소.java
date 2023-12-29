import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long cost = 0;
        int N = Integer.parseInt(br.readLine());
        long[] distance = new long[N - 1];
        long[] oil = new long[N];

        String inputString = br.readLine();
        StringTokenizer inputStringTokenizer = new StringTokenizer(inputString, " ");
        for (int i = 0; i < N-1; i++) {
            distance[i] = Long.parseLong((inputStringTokenizer.nextToken()));
        }
        inputString = br.readLine();
        StringTokenizer inputStringTokenizer2 = new StringTokenizer(inputString, " ");
        for (int i = 0; i < N; i++) {
            oil[i] = Long.parseLong((inputStringTokenizer2.nextToken()));
        }

        long minOilCost = oil[0];
        for (int i = 0; i < N-1; i++) {
            if (oil[i] < minOilCost) minOilCost = oil[i];
            cost += minOilCost * distance[i];
        }

        bw.write(cost + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}