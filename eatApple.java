import java.io.*;
import java.util.*;

public class eatApple {
	static int dr[] = {0, 1, 0, -1}; // 우, 하, 좌, 상
	static int dc[] = {1, 0, -1, 0};
	static int n;
	static int[][] apple, map;
	
	public static boolean isValid(int r, int c) {
		return r >= 0 && r < n && c >= 0 && c < n;
	}
	
	public static boolean canEat(int r, int c, int d, int target) {
		int nd = (d + 1) % 4;
		r += dr[nd];
		c += dc[nd];
		while(isValid(r, c)) {
			if(r == apple[target][0] && c == apple[target][1]) return true;
			r += dr[nd];
			c += dc[nd];
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test = Integer.parseInt(br.readLine().trim());
		apple = new int[11][2];
		for(int tc = 1; tc <= test; tc++) {
			n = Integer.parseInt(br.readLine().trim()); 
			map = new int[n][n];
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					int value = Integer.parseInt(st.nextToken());
					map[i][j] = value;
					if(value > 0) {
						apple[value][0] = i;
						apple[value][1] = j;
						cnt++;
					}
				}
			}
			
			int rotate, d, r, c;
			rotate = d = r = c =0;
			int target = 1;
			
			while(cnt > 0){
				if(map[r][c] == target) {
					map[r][c] = 0;
					target++;
					cnt--;
					if(cnt == 0) break;
				}
				
				if(canEat(r, c, d, target)) {
					r = apple[target][0];
					c = apple[target][1];
					d = (d + 1) % 4;
					rotate++;
					continue;
				}
				
				int nr = r + dr[d];
				int nc = c + dc[d];
				if(isValid(nr, nc)) {
					r = nr;
					c = nc;
				} else {
					d = (d + 1) % 4;
					rotate++;
				}
			}
			sb.append("#").append(tc).append(" ").append(rotate).append("\n");
		}
		System.out.println(sb);
	}
}
