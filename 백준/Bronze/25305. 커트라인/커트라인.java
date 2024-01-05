import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] cutLine = new int[2];

        String inputString = br.readLine();
        StringTokenizer inputStringTokenizer = new StringTokenizer(inputString, " ");
        for (int i = 0; i < 2; i++) {
            cutLine[i] = Integer.parseInt(inputStringTokenizer.nextToken());
        }

        int[] num = new int[cutLine[0]];

        inputString = br.readLine();
        StringTokenizer inputStringTokenizer2 = new StringTokenizer(inputString, " ");
        for (int i = 0; i < cutLine[0]; i++) {
            num[i] = Integer.parseInt(inputStringTokenizer2.nextToken());
        }

        Arrays.sort(num);

        System.out.println(num[cutLine[0]-cutLine[1]]);
//        bw.write(max + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

}