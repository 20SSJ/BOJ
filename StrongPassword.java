import java.io.*;

public class StrongPassword {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		boolean dF = true;
		boolean lF = true;
		boolean cF = true;
		boolean sF = true;
		
		String st = br.readLine();
		if(st.matches(".*[!@#$%^&*()-+].*")) sF = false;
		
		for(int i = 0; i < N; i++) {
			char check = st.charAt(i);
			if(Character.isDigit(check)) dF = false;
			else if(Character.isLowerCase(check)) lF = false;
			else if(Character.isUpperCase(check)) cF = false;
		}
		
		int ans = 0;
		if(dF) ans++;
		if(lF) ans++;
		if(cF) ans++;
		if(sF) ans++;
		System.out.println(Math.max(ans, 6-N));
	}

}
