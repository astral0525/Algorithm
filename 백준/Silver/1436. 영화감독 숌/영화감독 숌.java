import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 666;
        int count = 1;

        while(count != n){
            num++;
            /*메모리초과
            if(String.valueOf(num).matches(".*666.*")){
                count++;
            }
            */
            if(String.valueOf(num).contains("666")){
                count++;
            }

        }
        System.out.println(num);





    }

}