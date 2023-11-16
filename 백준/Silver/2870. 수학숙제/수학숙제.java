
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n;
    static String[] s;

    public static void main(String[] args) {
        ArrayList<BigInteger> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = sc.nextLine();
        }

        for(int i=0; i<n; i++){
            String a[] = s[i].split("[a-z]+");
            for(int j=0; j<a.length; j++){
                try{
                    list.add(new BigInteger(a[j]));
                }catch (Exception e){
                }
            }
        }
        Collections.sort(list);

        for(BigInteger n: list){
            System.out.println(n);
        }

    }
}