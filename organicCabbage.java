import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class organicCabbage {
	static int m, n, k;
	static int [][] oc;
	static boolean [][] visited;
	static int [] dx = { 0, 0, -1, 1};
	static int [] dy = { -1, 1, 0, 0};

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
	
		for(int i = 0; i < T; i++) {			
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());

			oc = new int [m][n];
			visited = new boolean[m][n];
			
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				oc[x][y] = 1;
			}
			
			int cnt = 0;
			
			for(int x = 0; x < m; x++) {
				for (int y = 0; y < n; y++) {
					if(oc[x][y] == 1 && !visited[x][y]) {
						dfs(x,y);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			}
		br.close();
	}
	
	private static void dfs(int x, int y) {
		visited[x][y] = true;
		for(int d = 0; d < 4; d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			if(nx < 0 || nx >= m || ny < 0 || ny >= n || visited[nx][ny]) continue;
			if(oc[nx][ny] == 1) dfs(nx, ny);
		}
	}
}
