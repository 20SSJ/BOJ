import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
public class workBook {

	static ArrayList<ArrayList<Integer>> p;
	static int[] indgree;
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		p = new ArrayList<>();
		for(int i = 0; i <= N; i++) {
			p.add(new ArrayList<>());
		}
		
		indgree = new int[N + 1];
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			p.get(A).add(B);
			indgree[B]++;
		}
		topologySort();
	}
	private static void topologySort() {
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 1; i <= N; i++) {
			if(indgree[i] == 0) {
				pq.offer(i);
			}
		}
		while(!pq.isEmpty()) {
			int now = pq.poll();
			sb.append(now).append(" ");
			
			for(int nxt: p.get(now)) {
				indgree[nxt]--;
				if(indgree[nxt] == 0) pq.offer(nxt);
			}
		}
		System.out.println(sb);
	}

}
