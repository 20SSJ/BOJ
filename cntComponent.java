import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cntComponent {

	static boolean[] visited;
	static int result = 0;
	static int n, m;
	static int x, y;
	static int [][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken()); 
			arr[x][y] = arr[y][x] = 1;
		}
		
		for (int i = 1; i < n+1; i++) {
			if(!visited[i]) {
				dfs(i);
				result++;
			}
		}
		System.out.println(result);
		
	}
	public static void dfs(int node) {
		visited[node] = true;
		
		for(int i = 1; i < n+1; i++) {
			if(!visited[i] && arr[node][i] == 1) dfs(i);
		}
	}

}
