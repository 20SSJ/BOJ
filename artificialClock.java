import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class artificialClock {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int D = Integer.parseInt(br.readLine());
		int time = 0;
		
		C += D;
		time = C/60;
		C %= 60;
		
		B += time;
		time = B/60;
		B %= 60;
		
		A += time;
		A %= 24;
		
		System.out.println(A + " " + B + " " + C);
	}

}
