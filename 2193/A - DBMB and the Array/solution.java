import java.util.*;
 
public class Main {
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();
 
            long sum = 0;
 
            for(int i=0;i<n;i++){
                sum += sc.nextInt();
            }
 
            if(sum > s){
                System.out.println("NO");
            }
            else if((s - sum) % x == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}