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

        int count = 0;
        int i = 0;

        String inputString = br.readLine();
        StringTokenizer inputStringTokenizer = new StringTokenizer(inputString, " ");
        int[] target = new int[2];

        while (inputStringTokenizer.hasMoreElements()) {
            target[i] = Integer.parseInt(inputStringTokenizer.nextToken());
            i++;
        }
        Integer[] coin = new Integer[target[0]];
        for (i = 0; i < target[0]; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(coin, Collections.reverseOrder());

        for (i = 0; i < target[0]; i++) {
            if (target[1] == 0) break;
            if (coin[i] <= target[1]) {
                target[1] -= coin[i];
                i--;
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}