import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num>0){
            int value = scan.nextInt();
            int find = scan.nextInt();
            int high = value;
            int low = value;
            int iter = 0;
            boolean found = false; 
            while (low >= find || high >= find ){
                if(low == find || high == find){
                    found = true;
                    break;
                }
                low =(low/2);
                high =(high+1)/2;
                iter++;
            }
            if (found){
            System.out.println(iter);
            } else {
                System.out.println(-1);
            }
            num--;
        }
    }
}