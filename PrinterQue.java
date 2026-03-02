import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class PrinterQue {
	static class Node{
		int idx, p;

		public Node(int idx, int p) {
			this.idx = idx;
			this.p = p;
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test = 1; test <= T; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			Queue<Node> q = new ArrayDeque<>();
			int[] importances = new int[10];
			
			int maxP = 0;
			for(int i = 0; i < N; i++) {
				int importance = Integer.parseInt(st.nextToken());
				if(maxP < importance) maxP = importance;
				importances[importance]++;
				q.offer(new Node(i, importance));
			}
			
			int count = 0;
			
			while(!q.isEmpty()) {
				while(maxP > 0 && importances[maxP] == 0) {
					maxP--;
				}
				
				Node now = q.poll();
				if(now.p == maxP) {
					count++;
					importances[maxP]--;
					if(now.idx == M) {
						System.out.println(count);
						break;
					}
				} else {
					q.offer(now);
				}
			}
		}
	}
}
