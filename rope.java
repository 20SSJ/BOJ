import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class rope {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] rope = new int[N];
		for(int i = 0; i < N; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rope);
		
		int mx = 0;
		for (int i = 0; i < N; i++) {
			mx = Math.max(mx, rope[i] * (N-i));
		}
		System.out.println(mx);
	}

}
