import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int a = (int) (n*0.78);
		int b = (int)(n*0.8+(n*0.2)*0.78);
		System.out.print(a + " " + b);	}

}
