import java.util.*;
public class Main {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-->0){
			int n = scan.nextInt();
			long [] b = new long[n];
			for (int idx =0;idx<n;idx++){
				b[idx] = scan.nextLong();
			}
			Arrays.sort(b);
			boolean ok = true;
			for (int idx = n-1; idx >= 2;idx--){
				if (b[idx]%b[idx-1] != b[idx-2]){
					ok = false;
					break;
				}
			}
			if (ok){
				System.out.println(b[n-1]+" "+b[n-2]);
			}else {
				System.out.println("-1");
			}
			
		}
		scan.close();
	}
}