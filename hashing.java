import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hashing {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String st = br.readLine();
		long ans = 0;
		long pow = 1;
		long M = 1234567891;
		for(int i = 0; i < L; i++) {
			int alpha = st.charAt(i) - 'a' + 1; 
			ans = (ans + alpha * pow % M) % M;
			pow = (pow * 31) % M;
		}
		System.out.println(ans);
	}
}
