
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String pattern = sc.nextLine();
        String[] a_pattern = pattern.split("\\*", 2);
        String regex = a_pattern[0] + "[a-z]*" + a_pattern[1];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.matches(regex)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }


    }
}