import java.io.*;
import java.util.*;

public class task {
	
	static int[] indgree, time;
	static int N;
	static List<Integer>work[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 작업의 개수
		N = Integer.parseInt(br.readLine());
		
		indgree = new int[N+1];
		work = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) {
			work[i] = new ArrayList<>();
		}
		time = new int[N + 1];
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i] = Integer.parseInt(st.nextToken());
			int qty = Integer.parseInt(st.nextToken());
			indgree[i] = qty;
			for(int j = 0; j < qty; j++) {
				int w = Integer.parseInt(st.nextToken());
				work[w].add(i);
			}
		}
		topologySort();
	}
	
	private static void topologySort() {
		Queue<Integer> q = new ArrayDeque<>();
		int[] dp = new int[N + 1];
		for(int i = 1; i <= N; i++) {
			if(indgree[i] == 0) q.offer((i));
			dp[i] = time[i];
		}
		while(!q.isEmpty()) {
			int size = q.size();
			int now = q.poll();
			for(int nxt: work[now]) {
				dp[nxt] = Math.max(dp[nxt], dp[now] + time[nxt]);
				indgree[nxt]--;
				if(indgree[nxt] == 0) q.offer(nxt);
			}
		}
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}

}
