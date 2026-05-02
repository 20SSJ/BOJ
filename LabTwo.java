import java.io.*;
import java.util.*;

public class LabTwo {
	static int dr[] = {-1, 1, 0, 0};
	static int dc[] = {0, 0, -1, 1};
	static int N, M, ans, totalCnt, MX = 501;
	static int map[][];
	static List<int[]> virus;
	
	private static void combi(int idx, int start, int[][] sel) {
		if(idx == M) {
			ans = Math.min(ans, bfs(sel));
			return;
		}
		
		for(int i = start; i < virus.size(); i++) {
			int[] current = virus.get(i);
			int curR = current[0];
			int curC = current[1];
			sel[idx][0] = curR;
			sel[idx][1] = curC;
			combi(idx + 1, i + 1, sel);
		}
	}
	
	public static int bfs(int[][] v) {
		Queue<int[]> q = new ArrayDeque<>();
		boolean[][] visit = new boolean[N][N];
		
		for(int[] nxt : v) {
			int r = nxt[0];
			int c = nxt[1];
			q.offer(new int[] {r, c});
			visit[r][c] = true;
		}
		
		int time = 0;
		int cnt = totalCnt;
		while(!q.isEmpty() && cnt != 0) {
			int size = q.size();
			while(size-- > 0) {
				int[] cur = q.poll();
				int curR = cur[0];
				int curC = cur[1];
				
				for(int d = 0; d < 4; d++) {
					int nr = curR + dr[d];
					int nc = curC + dc[d];
					if(isValid(nr, nc) && map[nr][nc] != 1 && !visit[nr][nc]) {
						q.offer(new int[] {nr, nc});
						visit[nr][nc] = true;
						cnt--;
					}
				}
			}
			time++;
		}
		if(cnt != 0) return MX;
		else return time;
	}
	
	public static boolean isValid(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		totalCnt = -M;
		virus = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				int value = Integer.parseInt(st.nextToken());
				map[i][j] = value;
				if(value != 1) {
					totalCnt++;
					if(value == 2) virus.add(new int[] {i, j});
				}
			}
		}
		ans = MX;
		combi(0, 0, new int[M][2]);
		if(ans == MX) System.out.println(-1);
		else System.out.println(ans);
	}

}
