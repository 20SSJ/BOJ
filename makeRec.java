import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class makeRec {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		/*
		 * 1*1 2 3 4 5 6
		 * 2*2 3
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = i; i * j <= n; j++) {
					cnt++;
			}
		}
		System.out.println(cnt);
	}

}
