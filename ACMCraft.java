import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ACMCraft {
	static int[] indgree, bld;
	static int N, K, W;
	static ArrayList<ArrayList<Integer>> arch;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test = 1; test <= T; test++) {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			bld = new int[N + 1];
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= N; i++) {
				bld[i] = Integer.parseInt(st.nextToken());
			}
			arch = new ArrayList<>();
			for(int i = 0; i <= N; i++) {
				arch.add(new ArrayList<>());
			}
			indgree = new int[N + 1];
			while(K-- > 0) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				arch.get(X).add(Y);
				indgree[Y]++;
			}
			W = Integer.parseInt(br.readLine());
			topologySort();
		}
	}

	private static void topologySort() {
		Queue<Integer> q = new ArrayDeque<>();
		int[] dp = new int[N+1];

		for(int i = 1; i <= N; i++) {
			dp[i] = bld[i];
			if(indgree[i] == 0) q.add(i);
		}

		while(!q.isEmpty()) {
			int size = q.size();
			while(size-- > 0) {				
				int now = q.poll();
				
				for(int nxt: arch.get(now)) {
					dp[nxt] = Math.max(dp[nxt], dp[now] + bld[nxt]);
					indgree[nxt]--;
					if(indgree[nxt] == 0) q.offer(nxt);
				}
			} 
		}
		System.out.println(dp[W]);
	}

}
