package SWEA;

import java.util.Scanner;

public class expo {
	
	private static void calc(int idx, int N, int M, int res) {
		
		res *= N;
		if(idx + 1 == M) {
			System.out.println(res);
			return;
		}
		calc(idx + 1, N, M, res);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tc = 0;
		while(tc != 10) {
			tc = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			System.out.print("#" + tc + " ");
			calc(0, N, M, 1);
		}
	}
}
