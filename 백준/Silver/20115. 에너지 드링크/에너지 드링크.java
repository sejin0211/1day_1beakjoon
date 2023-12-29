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


        int N = Integer.parseInt(br.readLine());
        Double[] drink = new Double[N];

        String inputString = br.readLine();
        StringTokenizer inputStringTokenizer = new StringTokenizer(inputString, " ");
        for (int i = 0; i < N; i++) {
            drink[i] = Double.valueOf(inputStringTokenizer.nextToken());
        }
        Arrays.sort(drink, Collections.reverseOrder());
        double max = drink[0];

        for (int i = 1; i < N; i++) {
            max += drink[i] / 2;
        }

        bw.write(max + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}