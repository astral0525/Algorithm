import java.util.Scanner;

public class Main {
    static int h, w;
    static int[][] cloud;

    public static void main(String[] args) {
        //입력파트
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        sc.nextLine();
        cloud = new int[h][w];
        for(int i=0; i<h; i++){
            String s = sc.nextLine();
            for(int j=0; j<w; j++){
                if(s.charAt(j)== 'c'){
                    cloud[i][j] = 0;
                }else{
                    cloud[i][j] = -1;
                }
            }
        }
        

        for(int i=0; i<h; i++){
            for(int j=1; j<w; j++){
                switch(cloud[i][j-1]){
                    case -1:
                        break;
                    default:
                        if(cloud[i][j]==0 ) break;
                        else cloud[i][j] = cloud[i][j-1]+1;
                        break;
                }
            }
        }

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.printf("%d ", cloud[i][j]);
            }
            System.out.println();
        }



    }
}