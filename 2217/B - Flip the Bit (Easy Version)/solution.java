import java.util.*;
public class Main {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for (int itr = testCase; itr > 0;itr--){
			int N = scan.nextInt();
			int K = scan.nextInt();
			int [] array = new int [N+2];
			for (int idx = 1;idx<=N;idx++){
				array[idx] = scan.nextInt();
			}
			int spi = scan.nextInt();
			int [] dp = new int[N+2];
			array[0] = array[N+1] = array[spi];
			for (int idx = 1;idx<spi;idx++){
				dp[idx] = dp[idx-1] + (array[idx] == array[idx-1]? 0:1);
			}
			for (int idx = N;idx>spi;idx--){
				dp[idx] = dp[idx+1] + (array[idx] == array[idx+1]? 0:1);
			}
			dp[spi] = Math.max(dp[spi-1],dp[spi+1]);
			if ((dp[spi+1] >= dp[spi-1] && array[spi]!= array[spi+1])||(dp[spi-1]>=dp[spi+1] && array[spi]!= array[spi-1])){
				dp[spi]++;
			}
			System.out.println(dp[spi]);
		}
	}
}