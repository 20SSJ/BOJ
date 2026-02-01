import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 한 번에 회전을 다 시켜보기
 * 회전한 만큼 곱한 것을 결과에 넣어보자
 * -> 문제점: 열이나 행을 벗어나면 어떡하나
 * 반복 횟수는 같음(횟수의 수정은 할 필요가 없어보임)
 * if문으로 수정이 필요해보임
 */
public class arrSpin2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int [][] arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int layers = Math.min(N, M) / 2;
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < layers; j++) {
				int rw = j;
				int c = j;
				int tmp = arr[rw][c];
				// 위에 부분
				for(int u = 0; u < (M - 1 - 2 * j); u++) {
					arr[rw][c] = arr[rw][++c];
				}
				// 오른쪽
				for(int rght = 0; rght < (N-1 - 2 * j); rght++) {
					arr[rw][c] = arr[++rw][c];
				}
				// 아래쪽
				for(int d = 0; d < (M-1 - 2 * j); d++) {
					arr[rw][c] = arr[rw][--c];
				}
				// 왼쪽
				for(int l = 0; l < (N-1 - 2 * j); l++) {
					arr[rw][c] = arr[--rw][c];
				}
				arr[rw+1][c] = tmp; 
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
