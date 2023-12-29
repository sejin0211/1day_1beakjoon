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

        int cost = 0;
        int N = Integer.parseInt(br.readLine());
        int[] distance = new int[N - 1];
        int[] oil = new int[N];

        String inputString = br.readLine();
        StringTokenizer inputStringTokenizer = new StringTokenizer(inputString, " ");
        for (int i = 0; i < N-1; i++) {
            distance[i] = Integer.parseInt(inputStringTokenizer.nextToken());
        }
        inputString = br.readLine();
        StringTokenizer inputStringTokenizer2 = new StringTokenizer(inputString, " ");
        for (int i = 0; i < N; i++) {
            oil[i] = Integer.parseInt(inputStringTokenizer2.nextToken());
        }

        int minOilCost = oil[0];
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