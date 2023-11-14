
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    //좌표저장 - 순서대로 상 하 좌 우
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int n;
    static int m;
    static int[][] miro;
    static boolean[][] visited;     //방문여부 배열 선언


    public static void main(String[] args) {

        //값 입력
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();  //엔터키 입력제거

        miro = new int[n][m]; //미로 배열 선언
        visited = new boolean[n][m]; //방문여부 배열 선언

        //값입력
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < m; j++) {
                miro[i][j] = (int)(s.charAt(j) - '0');
            }
        }

        BFS(0,0);
        System.out.println(miro[n-1][m-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        visited[i][j] = true;     //방문상태로 변경
        while(!queue.isEmpty()){ //큐가 비어있을 때 까지
            int now[] = queue.poll();  //현재
            for(int k=0; k<4; k++){     //상하좌우 탐색
                int x = now[0] + dx[k]; //(상,하,좌,우)중 하나로 움직인 현재 x좌표
                int y = now[1] + dy[k]; //(상,하,좌,우)중 하나로 움직인 현재 y좌표
                if(x>= 0 && y>=0 && x<n && y<m){ //유효한 좌표인지 확인
                    if(miro[x][y]!=0 && !visited[x][y]){ //방문가능칸&방문안함
                        visited[x][y] = true;
                        miro[x][y] = miro[now[0]][now[1]] + 1; //BFS의 depth증가
                        queue.offer(new int[] {x,y});
                    }
                }


            }

        }

    }
}