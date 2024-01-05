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
        int [] ascending = new int[N];

        for (int i = 0; i < N; i++) {
            ascending[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ascending);
        for (int i = 0; i < N; i++) {
            System.out.println(ascending[i]);
        }


//        bw.write(max + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}