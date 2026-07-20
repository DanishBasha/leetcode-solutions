import java.util.*;
 
public class Main {
    static boolean canMake(String s, char start) {
        int n = s.length();
        char[] target = new char[n];
        
        
        for (int i = 0; i < n; i++) {
            target[i] = (i % 2 == 0) ? start : (start == 'a' ? 'b' : 'a');
        }
        
        int l = -1, r = -1;
        
       
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != target[i]) {
                if (l == -1) l = i;
                r = i;
            }
        }
        
       
        if (l == -1) return true;
        
        
        for (int i = l; i <= r; i++) {
            if (s.charAt(i) == target[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            
            if (canMake(s, 'a') || canMake(s, 'b')) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}