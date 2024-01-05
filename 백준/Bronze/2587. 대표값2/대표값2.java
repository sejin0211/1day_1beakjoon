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

        int [] num = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(br.readLine());
            sum += num[i];
        }
        Arrays.sort(num);


        System.out.println(sum/5);
        System.out.println(num[2]);

//        bw.write(max + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}