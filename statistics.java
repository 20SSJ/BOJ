import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class statistics {
	
	static final int OFFSET = 4000;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[8001];
		int mx = -4001;
		int mn = 4001;
		int sum, maxFreq, freq;
		sum = maxFreq = freq = 0;
		
		for(int i = 1; i <= N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num + OFFSET]++;
			if(maxFreq < arr[num + OFFSET]) {
				maxFreq = arr[num + OFFSET];
			}
			sum += num;
			if(mx < num) mx = num;
			if(mn > num) mn = num;
		}
		
		System.out.println((int)Math.round((double)sum / N));
		
		int cnt, count, median;
		median = cnt = count = 0;
		int target = (N + 1) / 2;
		boolean bflg = true;
		boolean mflg = true;
		
		for(int i = mn + OFFSET; i <= mx + OFFSET; i++) {
			
			if(arr[i] > 0) count += arr[i];
			if(mflg) {				
				if(count >= target) {
					median = i - OFFSET;
					mflg = false;
				}
			}
			
			if(bflg) {
				if(maxFreq == arr[i]) {
					cnt++;
					freq = i - OFFSET;
					if(cnt == 2) bflg = false;
				}
			}
		}
		
		System.out.println(median);
		System.out.println(freq);
		System.out.println(mx - mn);
	}

}
