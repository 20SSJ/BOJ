import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class findTreeParent {

	static List<Integer>[] graph;
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		graph = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}
		for(int i = 2; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			graph[A].add(B);
			graph[B].add(A);
		}
		bfs(1);
	}

	private static void bfs(int start) {
		Queue<Integer>q = new ArrayDeque<>();
		q.offer(start);
		
		boolean[] v = new boolean[N + 1];
		v[start] = true;
		int[] parent = new int[N+1];
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			for(int nxt: graph[now]) {
				if(!v[nxt]) {
					v[nxt] = true;
					parent[nxt] = now;
					q.offer(nxt);
				}
			}
		}
		
		for(int i = 2; i<= N; i++) {
			System.out.println(parent[i]);
		}
	}

}
