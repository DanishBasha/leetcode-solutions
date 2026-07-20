import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // number of test cases
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                if (i < n) System.out.print(" ");
            }
            System.out.println();
        }
 
        sc.close();
    }
}