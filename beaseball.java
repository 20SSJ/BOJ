import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baseball {
	static boolean[] v;
	static int N, score, res[], arr[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][9];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 4번째는 첫 번째로 고정
		v = new boolean[9];
		v[3] = true;
		
		res = new int[9];
		res[0] = 3;
		permutation(1); // 1부터 시작
		System.out.println(score);
	}
	
	// 순열
	private static void permutation(int idx) {
		if(idx == 9) {
			start();
			return;
		}
		for(int i = 0; i < 9; i++) {
			if(!v[i]) {
				v[i] = true;
				res[idx] = i;
				permutation(idx + 1);
				v[i] = false;
			}
		}
	}
	
	private static void start() {
		int idx = res[0];
		score = 0;
		int[] v = new int [3];
		for(int i = 0; i < N; i++) {
			int out = 0;
			
			for(int j = 0; j < 9; j++) {
				if(out >= 3) break;
				if(arr[i][idx] == 0) {
					out++;
					idx++;
					continue;
				} else if(arr[i][idx] == 1) {
					if(v[1] == 0) {
						v[1] = 1;
					}
					if(v[1] == 1) {
						v[1] = 0;
						v[2] += 1;
					}
					if(v[2] == 1) {
						v[2] = 0;
						v[3] = 1;
					}
					if(v[3] == 1) {
						score += 1;
						v[3] = 0;
					}


				} else if(arr[i][idx] == 2) {
					
				} else if(arr[i][idx] == 3) {
					score += v[0] + v[1] + v[2];
					v[0] = v[1] = v[2] = 0;
				}
			}
		}
	}

}
