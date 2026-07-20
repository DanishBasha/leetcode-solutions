import java.util.*;
 
public class Main {
 
    // function to compute value of array
    static int getValue(int[] a) {
        int max = 0;
        int sum = 0;
        for (int x : a) {
            if (x > max) max = x;
            sum += max;
        }
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
 
            int answer = getValue(a); // no swap case
 
            // try all swaps
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
 
                    // swap
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
 
                    answer = Math.max(answer, getValue(a));
 
                    // swap back
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}