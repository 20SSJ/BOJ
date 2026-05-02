import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swtichOnOff {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int []sw = new int[n];
		for (int i = 0; i < n; i++) {
			sw[i] = Integer.parseInt(st.nextToken());
		}
		int oo = Integer.parseInt(br.readLine());
		for (int i = 0; i  < oo; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			if(gender == 1) {
				for (int j = 1; j * r - 1 < n; j++) {
					if(sw[j*r - 1] == 0) {
						sw[j*r - 1] = 1; 
					}
					else {
						sw[j*r - 1] = 0;
					}
				}
			}
			else {
				int idx = r - 1;
				if (sw[idx] == 0) {
					sw[idx] = 1;
				}
				else {
					sw[idx] = 0;
				}
				for (int j = 1; idx + j < n; j++) {
					if (idx - j < 0) break;
					if(sw[idx -j] == sw[idx+j]) {
						if(sw[r-1 - j] == 0) {
							sw[idx-j] = sw[idx+j] = 1;
						}
						else {
							sw[idx-j] = sw[idx+j] = 0;
						}
					}
					else break;
				}
			}
		}
		for(int i = 0; i< n; i++) {
			System.out.print(sw[i] + " ");
			if ((i + 1) % 20 == 0) System.out.println();
		}
	}

}
