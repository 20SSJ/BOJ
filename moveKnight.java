import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class moveKnight {
		
	static int[] kR = {-2, -2, -1, -1, 2, 2, 1, 1};
	static int[] kC = {-1, 1, -2, 2, -1, 1, -2, 2};
	static int size, nowR, nowC, toR, toC;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test = 0; test < T; test++) {
			size = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			nowR = Integer.parseInt(st.nextToken());
			nowC = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			toR = Integer.parseInt(st.nextToken());
			toC = Integer.parseInt(st.nextToken());
			bfs(nowR, nowC);
		}
		br.close();
	}
	private static void bfs(int r, int c) {
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[] {r, c, 0});
		boolean[][] v = new boolean[size][size];
		v[r][c] = true;
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int cuR = cur[0];
			int curC = cur[1];
			int dist = cur[2];
			
			if(cuR == toR && curC == toC) {
				System.out.println(dist);
				return;
			}
			for(int d = 0; d < 8; d++) {
				int nr = cuR + kR[d];
				int nc = curC + kC[d];
				
				if(isValid(nr, nc) && !v[nr][nc]) {
					v[nr][nc] = true;
					q.offer(new int[] {nr, nc, dist + 1});
				}
			}
		}
		
	}
	private static boolean isValid(int r, int c) {
		// TODO Auto-generated method stub
		return (r >= 0 && r < size && c >= 0 && c < size);
	}

}
