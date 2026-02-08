import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHouse {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int layers = 1;
		int mx = 1;
		// 1- > 6(2~7) -> 12(8~19) -> 18(20~37) -> 24(38~61)
		while(true) {
			if(N <= mx) break;
			mx += (6 * layers);
			layers++;
		}
		System.out.println(layers);
	}
}
