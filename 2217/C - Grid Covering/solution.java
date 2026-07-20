import java.util.*;
public class Main{
	private static long gcd (long a, long b){
		if (b == 0){
			return a;
		}
		return gcd(b,a%b); 
	}
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while(testCase-->0){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			if ((gcd(n,a) == 1) && (gcd(m,b) == 1 && gcd(m,n)<=2)){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}