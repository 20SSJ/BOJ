import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class votePresident {

	static final int MXSIZE = 101;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int dist[][] = new int [N+1][N+1];
		for(int i = 1; i <= N; i++) {
			Arrays.fill(dist[i], MXSIZE);
			dist[i][i] = 0;
		}
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a == -1 && b == -1) break;
			dist[a][b] = 1;
			dist[b][a] = 1;
		}
		
		for(int k = 1; k <= N; k++) {
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					if(dist[i][j] > dist[i][k] + dist[k][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}
		
		int ans = MXSIZE;
		int result[] = new int[N+1];
		for(int i = 1; i <= N; i++) {
			int mx = 0;
			for(int j = 1; j <= N; j++) {
				if(dist[i][j] > mx) {
					mx = dist[i][j];
				}
			}
			if(mx < ans) ans = mx;
			result[i] = mx;
		}
		
		int count = 0;
		int[] candidate = new int[N+1];
		for(int i = 1; i <= N; i++) {
			if(result[i] == ans) {
				candidate[count++] = i;
			}
		}
		
		System.out.println(ans + " " + count);
		for(int i = 0; i < count; i++) {
			System.out.print(candidate[i] + " ");
		}
	}
}
