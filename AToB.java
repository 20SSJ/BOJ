import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class AToB {
	static class Node{
		long to, cnt;

		public Node(long to, long cnt) {
			this.to = to;
			this.cnt = cnt;
		}
	}
	
	static int B;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		System.out.println(bfs(A));
	}
	
	private static long bfs(int start) {
		Queue<Node> q = new ArrayDeque<>();
		q.offer(new Node(start, 1));
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			if(cur.to == B) return cur.cnt;
			
			long value = cur.to * 10 + 1;
			long[] arr = {2*cur.to, value};
			for(long nxt: arr) {
				if(nxt > B) continue;
				q.offer(new Node(nxt, cur.cnt + 1));
			}
		}
		return -1;
	}

}
