import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class noBlank {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String AB = br.readLine();
		int a, b;
		a = b = 0;
		if(AB.length() == 2) {			
			a = AB.charAt(0) - '0';
			b = AB.charAt(1) - '0';
		}
		else if(AB.length() == 3) {		
			if(AB.charAt(1) == '0') {
				a = 10;
				b = (AB.charAt(2) - '0');
			}
			else {
				a = (AB.charAt(0) - '0');
				b = 10;
			}
		}
		else if(AB.length() == 4) {			
			a = b = 10;
		}
		System.out.println(a+b);
	}

}
