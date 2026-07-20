import java.util.*;
public class Main {
    static int digitSum(long num){
        int sum = 0;
        while (num >0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            long x = scan.nextLong();
            int count = 0;
            for (long y = x;y<= x+90;y++){
                if (y - digitSum(y) == x){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}