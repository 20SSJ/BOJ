import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class hideAndSeek {
	static class Node implements Comparable<Node>{
		int to, weight;
		
		public Node(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(weight, o.weight);
		}
		
	}
	static final int SIZE = 100001;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		zeroOnebfs(n, k);
	}

	private static void zeroOnebfs(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		int[] dist = new int[SIZE];
		Arrays.fill(dist, SIZE);
		dist[start] = 0;
		
		while(!pq.isEmpty()) {
			Node e = pq.poll();
			
			if(e.to == end) {
				System.out.println(e.weight);
				return;
			}
			
			if(e.to*2 < SIZE && dist[e.to*2] > e.weight ) {
				dist[e.to*2] = e.weight;
				pq.offer(new Node(e.to*2, e.weight));
			}
			
			if(e.to - 1 >= 0 && dist[e.to - 1] > e.weight + 1) {
				dist[e.to - 1] = e.weight + 1;
				pq.offer(new Node(e.to - 1, e.weight + 1));
			}
			
			if(e.to + 1 < SIZE && dist[e.to + 1] > e.weight + 1) {
				dist[e.to + 1] = e.weight + 1;
				pq.offer(new Node(e.to + 1, e.weight + 1));
			}
		}
	}

}
