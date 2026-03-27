
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MovePipe { 

    static int N;
    static int[][] map;
    static int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // (0, 1) 위치에서 시작, 초기 상태는 가로(0)
        // 상태: 0(가로), 1(세로), 2(대각선)
        // 벽(1)이 있는 곳은 갈 수 없음
        if (map[N-1][N-1] == 1) { // 도착점이 막혀있으면 바로 0 출력
            System.out.println(0);
            return;
        }
        
        dfs(0, 1, 0); 
        System.out.println(cnt);
    }

    // y: 행, x: 열, dir: 현재 파이프 방향 (0:가로, 1:세로, 2:대각선)
    private static void dfs(int y, int x, int dir) {
        // 종료 조건: 목적지(N-1, N-1)에 도착했을 때
        if (y == N - 1 && x == N - 1) {
            cnt++;
            return;
        }

        // 1. 가로로 이동 (현재 가로(0)거나 대각선(2)일 때 가능)
        if (dir == 0 || dir == 2) {
            if (x + 1 < N && map[y][x + 1] == 0) {
                dfs(y, x + 1, 0);
            }
        }

        // 2. 세로로 이동 (현재 세로(1)거나 대각선(2)일 때 가능)
        if (dir == 1 || dir == 2) {
            if (y + 1 < N && map[y + 1][x] == 0) {
                dfs(y + 1, x, 1);
            }
        }

        // 3. 대각선으로 이동 (항상 가능하지만, 주변 3칸이 비어있어야 함)
        if (y + 1 < N && x + 1 < N) {
            // 대각선은 오른쪽, 아래, 대각선 자리가 모두 0이어야 함
            if (map[y][x + 1] == 0 && map[y + 1][x] == 0 && map[y + 1][x + 1] == 0) {
                dfs(y + 1, x + 1, 2);
            }
        }
    }
}