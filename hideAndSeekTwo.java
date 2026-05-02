import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class hideAndSeekTwo {
	
	static class Node{
		int to, time;
		
		public Node(int to, int time) {
			this.to = to;
			this.time = time;
		}
	}
	static int K;
	static final int SIZE = 100001;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		bfs(N);
		br.close();
	}
	
	private static void bfs(int start) {
		Queue<Node> q = new ArrayDeque<>();
		int[] dist = new int[SIZE];
		Arrays.fill(dist, SIZE);
		
		int ans = SIZE;
		int count = 0;

		q.offer(new Node (start, 0));
		dist[start] = 0;
		
		while(!q.isEmpty()) {
			Node now = q.poll();
			int node = now.to;
			int time = now.time;
			
			if(time > ans) break;
			
			if(node == K) {
				ans = time;
				count++;
				continue;
			}
			
			int[] nexts = {2*node, node - 1, node + 1};
			for(int nxt : nexts) {
				if(nxt < 0 || nxt >= SIZE) continue;
				if(dist[nxt] >= time + 1) {
					dist[nxt] = time + 1;
					q.offer(new Node(nxt, time + 1));
				}
			}
		}
		System.out.println(ans);
		System.out.println(count);
	}
}
