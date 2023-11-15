
import java.util.Scanner;

public class Main {
    static int[] apple; //사과 떨어지는 칸
    static int n, m, j;

    public static void main(String[] args) {
        int start = 1; //바구니 시작위치
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        //입력
        n = sc.nextInt();
        m = sc.nextInt();
        String s = sc.nextLine();
        j = Integer.parseInt(sc.nextLine());
        apple = new int[j];
        for(int i=0; i<j; i++){
            apple[i] = Integer.parseInt(sc.nextLine());
        }

        for(int i=0; i<j; i++){
            if(apple[i]<start){  //사과가 나보다 왼쪽에 있다
                answer += start-apple[i];
                start = apple[i];
            } else if (apple[i]>start+m-1) {    //사과가 나보다 오른쪽에 있다
                answer += apple[i]-start-m+1;
                start += apple[i]-start-m+1;
            }else{

            }
        }
        System.out.println(answer);
    }
}