import java.io.*;
public class NQueen {

	static int N, totalCnt;
	static boolean[] col, slash, bSlash;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		totalCnt = 0;
		
		col = new boolean[N + 1];
		slash = new boolean[2*N + 1]; // 합이 일정
		bSlash = new boolean[2*N + 1]; // 차가 일정
		
		setQueen(1);
		System.out.println(totalCnt);
	}
	
	static void setQueen(int row) {
		
		if(row > N) {
			++totalCnt;
			return;
		}
		for (int c = 1; c <= N; c++) {
			// 유망성 체크: row행 c열에 두는 것이 가능한지.
			if(col[c] || slash[row+c] || bSlash[row-c+N]) continue; // 가지치기
			
			col[c] = slash[row+c] = bSlash[row-c+N] = true;
			setQueen(row+1);
			col[c] = slash[row+c] = bSlash[row-c+N] = false; // 다른 선택지 시도를 위해 상태 원복
		}
	}

}
