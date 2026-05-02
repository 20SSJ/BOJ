import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

class Pairs{
	int r;
	int c;
	
	Pairs(int r, int c){
		this.r = r;
		this.c = c;
	}
}
public class CVD {
	static int dr[] = {-1, 1, 0, 0};
	static int dc[] = {0, 0, -1, 1};
	static int N;
	static char grid[][];
	static boolean[][] v, v2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		grid = new char [N][N];
		
		for(int i = 0; i < N; i++) {
			String st = br.readLine();
			for (int j = 0; j < N; j++) {
				grid[i][j] = st.charAt(j);
			}
		}
		// 입력
		
		int cnt, cntCVD;
		cnt = cntCVD = 0;
		
		v = new boolean[N][N];
		for(int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				if(!v[r][c]) {
					bfs(r, c);
					cnt++;
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(grid[i][j] == 'R') grid[i][j] = 'G';
			}
		}
		
		v = new boolean[N][N];
		for(int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				if(!v[r][c]) {
					bfs(r, c);
					cntCVD++;
				}
			}
		}
		System.out.println(cnt + " " + cntCVD);
	}

	private static void bfs(int r, int c) {
		Queue<Pairs> q = new ArrayDeque<>();
		q.offer(new Pairs(r, c));
		v[r][c] = true;
		char word = grid[r][c];
		while(!q.isEmpty()) {
			Pairs start = q.poll();
			for(int d = 0; d < 4; d++) {
				int nr = start.r + dr[d];
				int nc = start.c + dc[d];
				
				if(nr < 0 || nr >= N || nc < 0 || nc >= N || word != grid[nr][nc] || v[nr][nc]) continue;
				v[nr][nc] = true;
				q.offer(new Pairs(nr, nc));
			}
		}
	}

}
