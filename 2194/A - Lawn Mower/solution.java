import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1;i<=t;i++){
            int n = scan.nextInt();
            int w = scan.nextInt();
            int ans = ((n/w)*(w-1)) + Math.min((n%w),w-1);
            System.out.println(ans);
        }
    }
}