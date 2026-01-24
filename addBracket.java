import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * n이 20이하이므로 브루트포스
 * n은 무조건 홀수
 * 
 * 최대 몇 번 계산가능한지 수식을 만들어보자
 * 3 - 1번 2n + 1
 * 5 - 2번 2n + 1
 * 7 - 3번 2n + 1
 * (n-1) / 2
 */
public class addBracket {
	static int ans = Integer.MIN_VALUE;
	static char[]ops;
	static int[] nums;
	static int SIZEOPS;
	static int SIZENUMS;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		SIZENUMS =  (n + 1)/ 2; // 숫자의 개수
		SIZEOPS = (n - 1) / 2; // 연산자의 개수
		ops = new char[SIZEOPS];
		nums = new int[SIZENUMS];
		int o = 0;
		int nu = 0;
		String input = br.readLine();
		for(int i = 0; i < n; i++) {
			char c = input.charAt(i);
			if(Character.isDigit(c)) {
				int num = c - '0';
				nums[nu++] = num;
			} else ops[o++] = c;
		}
		
		dfs(0, nums[0]);
		
		System.out.println(ans);
	}
	
	private static void dfs(int idx, int res) {
		if(idx == SIZEOPS) {			
			ans = Math.max(ans, res);
			return;
		}
		// 순서대로 계산할 경우
		int tmp = calc(ops[idx], res, nums[idx+1]);
		dfs(idx+1, tmp);
		
		if(idx + 1 < SIZEOPS) {
			int brackets = calc(ops[idx + 1], nums[idx + 1], nums[idx + 2]);
			int tmp2 = calc(ops[idx], res, brackets);
			dfs(idx + 2, tmp2);
		}
	}

	public static int calc(char op, int n1, int n2) {
		switch(op) {
		case '+':
			return n1 + n2;
		case '-':
			return n1 - n2;
		case '*':
			return n1 * n2;
		}
		return -1;
	}
}
