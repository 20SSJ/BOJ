import java.io.*;
import java.util.*;

public class travelWithDog {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test = 0; test < T; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			List<Integer> nation[]= new ArrayList[N + 1];
			for(int i = 1; i <= N; i++) {
				nation[i] = new ArrayList<>();
			}
			while(M-- > 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				nation[a].add(b);
				nation[b].add(a);
			}
			System.out.println(N - 1);
		}
		br.close();
	}

}
