import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class findMinValue {
	static class Node{
		int idx, value;

		public Node(int idx, int value) {
			this.idx = idx;
			this.value = value;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		Deque<Node> d = new ArrayDeque<>();
		for(int i = 1; i <= N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			while(!d.isEmpty() && d.peekLast().value > num) {
				d.pollLast();
			}
			
			d.offer(new Node(i, num));
			
			if(d.peekFirst().idx < i - L + 1) {
				d.pollFirst();
			}
			
			sb.append(d.peekFirst().value).append(" ");
			
		}
		System.out.println(sb);
	}
}
