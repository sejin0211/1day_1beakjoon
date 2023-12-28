import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
        // 계획 
        // 로프를 입력받아서 배열에 저장
        // 로프 정렬
        // 최대 무게 들 수 있는 경우는 자기 자신의 들 수 있는 무게 * 남은 로프(자신보다 강한 로프)의 갯수
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] rope = new int[N];

		for (int i = 0; i < N; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rope); // 로프의 무게를 오름차순 정렬
		
        int max = rope[N-1];
		
		for (int i = 0; i < N; i++) {
			max = Math.max(max, rope[i] * (N - i));
		}

		bw.write(max + "\n");
		bw.flush();
		br.close();
		bw.close();
	}

}