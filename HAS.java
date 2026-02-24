import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class HAS {
	static class Node{
		int to, time;
		
		public Node(int to, int time) {
			this.to = to;
			this.time = time;
		}
	}
	static final int SIZE = 100001;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		bfs(n, k);
	}
	private static void bfs(int start, int end) {
		Queue<Node> q = new ArrayDeque<>();
		q.offer(new Node(start, 0));
		boolean[] v = new boolean[SIZE];
		v[start] = true;
		while(!q.isEmpty()) {
			Node cur = q.poll();
			if(cur.to == end) {
				System.out.println(cur.time);
				return;
			}
			if(cur.to * 2 < SIZE && !v[cur.to*2]) {
				q.offer(new Node(cur.to *2, cur.time + 1));
				v[cur.to*2] = true;
			}
			if(cur.to - 1 >= 0 && !v[cur.to - 1]) {
				q.offer(new Node(cur.to - 1, cur.time + 1));
				v[cur.to - 1] = true;
			}
			if(cur.to + 1 < SIZE && !v[cur.to + 1]) {
				q.offer(new Node(cur.to + 1, cur.time + 1));
				v[cur.to + 1] = true;
			}
		}
	}

}
