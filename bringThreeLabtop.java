import java.io.*;
import java.util.StringTokenizer;

public class bringThreeLabtop {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T1 = Integer.parseInt(st.nextToken());
		int T2 = Integer.parseInt(st.nextToken());
		int ans = (T1 <= T2) ? T1 : T2;
		System.out.println(ans);
		br.close();
	}

}
