import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
public class VoteChair {

	static List<Integer> friends[];
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		friends = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) {
			friends[i] = new ArrayList<>();
		}
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a == -1 && b == -1) break;
			friends[a].add(b);
			friends[b].add(a);
		}
		
		int result[] = new int[N + 1];
		int ans = N;
		
		for(int i = 1; i <= N; i++) {
			result[i] = bfs(i);
			ans = Math.min(ans, result[i]);
		}
		
		int count = 0;
		int res[] = new int[N + 1];
		int idx = 0;
		for(int i = 1; i <= N; i++) {
			if(result[i] == ans) {
				count++;
				res[idx++] = i;
			}
		}
		
		System.out.println(ans + " " + count);
		
		for(int i = 0; i < idx; i++) {
			System.out.print(res[i] + " ");
		}
		br.close();
	}
	
	private static int bfs(int start) {
		int[] dist = new int[N + 1];
		Arrays.fill(dist, -1);
		Queue<Integer> q = new ArrayDeque<>();
		
		q.add(start);
		dist[start] = 0;
		int maxDist = 0;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			
			for(int nxt : friends[cur]) {
				if(dist[nxt] == -1) {
					dist[nxt] = dist[cur] + 1;
					maxDist = Math.max(maxDist, dist[nxt]);
					q.add(nxt);
				}
			}
		}
		return maxDist;
	}

}
