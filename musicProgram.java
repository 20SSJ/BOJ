import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class musicProgram {
	
	static int[] indgree;
	static int N;
	static List<Integer> singer[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		singer = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) {
			singer[i] = new ArrayList<>();
		}
		indgree = new int[N+1];
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int assist = Integer.parseInt(st.nextToken());
			int[] arr = new int[assist];
			for(int a = 0; a < assist; a++) {
				arr[a] = Integer.parseInt(st.nextToken());
			}
			// 보조 PD들이 입력한 순서들 배열에 넣기
			for(int j = 1; j < assist; j++) {
				singer[arr[j-1]].add(arr[j]);
				indgree[arr[j]]++;
			}
		}
		topologySort();
	}

	private static void topologySort() {
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new ArrayDeque<>();
		for(int i = 1; i <= N; i++) {
			if(indgree[i] == 0) q.offer(i);
		}
		if(q.size() == 0) {
			System.out.println(0);
			return;
		}
		int count = 0;
		while(!q.isEmpty()) {
			int now = q.poll();
			count++;
			sb.append(now).append("\n");
			for(int nxt : singer[now]) {
				indgree[nxt]--;
				if(indgree[nxt] == 0) q.offer(nxt);
			}
		}
		if(count == N) {
			System.out.println(sb);
		}else System.out.println(0);
	}

}
