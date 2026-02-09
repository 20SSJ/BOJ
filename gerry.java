import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class gerry {
	static int N, adj[][];
	static boolean isSelected[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 구역의 개수
		N = Integer.parseInt(br.readLine());
		
		// 구역의 인구 수 입력받기
		int [] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 인접 구역 정보
		adj = new int[N][N]; 
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			for (int j = 0; j < num; j++) {
				int link = Integer.parseInt(st.nextToken())-1;
				adj[i][link] = 1;
			}
		}
		
        isSelected[0] = true;
        subset(1);
        br.close();
	}
	
	private static void subset(int idx) {
		if (idx == N) {
			
			ArrayList<Integer> Rgroup = new ArrayList<>();
            ArrayList<Integer> Bgroup = new ArrayList<>();
            
            for (int i = 0; i < N; i++) {
            	if(isSelected[i]) Rgroup.add(i);
            	else Bgroup.add(i);
            }
            
			if(Rgroup.size() == 0 || Bgroup.size() == 0) return;
			
			if(bfs(Rgroup) && bfs(Bgroup)){
				
			}
			return;
		}
		
        isSelected[idx] = true;
        subset(idx + 1);

        isSelected[idx] = false;
        subset(idx + 1);
	}

	private static boolean bfs(ArrayList<Integer> group) {
		Queue<Integer> q = new ArrayDeque<>();
		boolean[] visited = new boolean[N];
		
		int start = group.get(0);
		q.offer(start);
		visited[start] = true;
		int cnt = 1;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			int size = q.size();
			for (int i = 0; i < N; i++) {
				if(adj[cur][i] == 1 && !visited[i]) {
					visited[i] = true;
					cnt++;
					q.offer(i);
				}
			}
		}
		
		return cnt == group.size();
	}

}
