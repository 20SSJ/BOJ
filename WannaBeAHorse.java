import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class WannaBeAHorse {
	static class Node{
		int r, c, dist, horse;

		public Node(int r, int c, int dist, int horse) {
			super();
			this.r = r;
			this.c = c;
			this.dist = dist;
			this.horse = horse;
		}
	}
	
	static int dr[] = {-1, 1, 0, 0};
	static int dc[] = {0, 0, -1, 1};
	static int hor[] = {-1, -1, 1, 1, 2, 2, -2, -2};
	static int hoc[] = {-2, 2, -2, 2, -1, 1, -1, 1};
	static int K, W, H, grid[][];
	static boolean[][][] v;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		grid = new int[H][W];
		for(int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < W; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(bfs(0, 0));
	}
	
	private static int bfs(int r, int c) {
		if (H == 1 && W == 1) return 0;
		
		Queue<Node> q = new ArrayDeque<>();
		v = new boolean[H][W][K+1];
		q.offer(new Node (r, c, 0, 0));
		v[r][c][0] = true;
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			for(int d = 0; d < 4; d++) {
				int nr = cur.r + dr[d];
				int nc = cur.c + dc[d];
				if(isValid(nr, nc, cur.horse)) {
					int dist = cur.dist + 1;
					if(nr == H - 1 && nc == W - 1) return dist;
					v[nr][nc][cur.horse] = true;
					q.offer(new Node(nr, nc, dist, cur.horse));
				}
			}
			
			if(cur.horse < K) {
				for(int d = 0; d < 8; d++) {
					int hr = cur.r + hor[d];
					int hc = cur.c + hoc[d];
					if(isValid(hr, hc, cur.horse + 1)) {
						int dist = cur.dist + 1;
						if(hr == H - 1 && hc == W - 1) return dist;
						v[hr][hc][cur.horse + 1] = true;
						q.offer(new Node(hr, hc, dist, cur.horse + 1));
					}
				}
			}
		}
		return -1;
	}
		
	private static boolean isValid(int r, int c, int k) {
		return (r >= 0 && r < H && c >= 0 && c < W && grid[r][c] == 0 && !v[r][c][k]);
	}

}
