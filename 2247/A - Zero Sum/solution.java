import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-->0){
            int size = scan.nextInt();
            int [] a = new int[size];
            int sum = 0;
            for (int idx = 0;idx<size;idx++){
                a[idx] = scan.nextInt();
                sum += a[idx];
            }
            if(size%2 == 1){
                System.out.println("No");
            }
            else if (sum%4 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}