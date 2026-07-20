import java.util.*;
 
public class D_OutOfMemoryError {
    static void solve(Scanner sc) {
        int N = sc.nextInt(), M = sc.nextInt(), H = sc.nextInt();
 
        int[] originalArr = new int[N];
        int[] resultArr = new int[N];
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            originalArr[i] = n;
            resultArr[i] = n;
        }
 
        HashSet<Integer> set = new HashSet<>();
 
        for (int i = 1; i <= M; i++) {
            int idx = sc.nextInt() - 1, num = sc.nextInt();
 
            resultArr[idx] += num;
 
            set.add(idx);
            if (resultArr[idx] > H) {
                for (Integer ind : set) {
                    resultArr[ind] = originalArr[ind];
                }
                set.clear();
            }
        }
 
        for (int num : resultArr) System.out.print(num + " ");
        System.out.println();
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int tc = sc.nextInt();
 
        while (tc-- > 0) {
            solve(sc);
        }
    }
}