import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class testDirector {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		long cnt = 0;
		int value, valueC;
		for(int i = 0; i < N; i++) {
			value = A[i] - B;
			cnt++;
			if(value > 0) {
				valueC = (value + C - 1) / C;
				cnt += valueC;
			}
		}
		System.out.println(cnt);
	}

}
