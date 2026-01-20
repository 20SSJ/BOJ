import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISBN {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
		int idx = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '*') {
				idx = i;
				continue;
			}
			else {
				int num = ch - '0';
				if((i+1) % 2 == 0) {
					sum += 3*num;
				}
				else {
					sum += num;
				}
			}
		}
		int weight = 0;
		if((idx + 1) % 2 == 0) weight = 3;
		else weight = 1;
		for(int i = 0; i < 10; i++) {
			sum += i * weight;
			if(sum % 10 == 0) {
				System.out.println(i);
				break;
			}
			sum -= i * weight;
		}
	}
}
