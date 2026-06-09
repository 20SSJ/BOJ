package SWEA;

import java.io.*;

public class SnailNum {

	static int dr[] = {0, 1, 0, -1};
	static int dc[] = {1, 0, -1, 0};
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append("\n");
			n = Integer.parseInt(br.readLine());
			int arr[][]= new int[n][n];
			int idx = 1;
			int d, r, c;
			d = r = c = 0;
			
			while(idx <= n*n) {
				arr[r][c] = idx++;
				int nr = r + dr[d];
				int nc = c + dc[d];
				if(!isValid(nr, nc) || arr[nr][nc] != 0) {
					d = (d + 1) % 4;
					nr = r + dr[d];
					nc = c + dc[d];
				}
				r = nr;
				c = nc;
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					sb.append(arr[i][j]).append(" ");
				}sb.append("\n");
			}
		} 
		System.out.println(sb);
	}
	
	private static boolean isValid(int r, int c) {
		return r >= 0 && r < n && c >= 0 && c < n;
	}
}
