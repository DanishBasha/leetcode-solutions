import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for (int case1 = testCase;case1>0;case1--){
            int N = scan.nextInt();
            int K = scan.nextInt();
            int sum = 0;
            for (int index = 0;index<N;index++){
                sum += scan.nextInt();
            }
            if(sum%2 != 0 || N*K % 2 == 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}