import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dubaiCookie {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int Ingrident = 900 + 60 + 600 + 170 + 160 + 110;
		int ans = N / Ingrident;
		System.out.println(ans);
	}

}
