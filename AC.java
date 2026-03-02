import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class AC {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test = 1; test <= T; test++) {
			String cmd = br.readLine();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
			
			ArrayDeque<Integer> deque = new ArrayDeque<>();
			for(int i = 0; i < n; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			
			boolean reverse = false;
			boolean bflg = false;
			for(int i = 0; i < cmd.length(); i++) {
				char c = cmd.charAt(i);
				if(c == 'R') {
					reverse = !reverse;
				}
				else {
					if(deque.size() == 0) {
						System.out.println("error");
						bflg = true;
						break;
					} else {
						if(reverse) deque.pollLast();
						else deque.pollFirst();
					}
				}
			}
			if(bflg) continue;
			StringBuilder sb = new StringBuilder();
			sb.append('[');
			int size = deque.size();
			for(int i = 0; i < size; i++) {
				if(reverse) {
					sb.append(deque.pollLast());
				} else {
					sb.append(deque.pollFirst());
				}
				if(i != size - 1) sb.append(",");
			}
			sb.append(']');
			System.out.println(sb);
		}
	}

}
