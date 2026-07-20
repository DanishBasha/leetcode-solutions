import java.util.*;
public class Main{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		scan.nextLine();
		while(testCase-->0){
			String first = scan.nextLine();
			String second = scan.nextLine();
			StringBuilder sbFirst = new StringBuilder();
			StringBuilder sbSecond = new StringBuilder();
			sbFirst.append(first.charAt(0));
			sbSecond.append(second.charAt(0));
			for(int idx = 1;idx<first.length();idx++){
				sbFirst.append(((sbFirst.charAt(idx-1)-'0')+(first.charAt(idx)-'0'))%10);
			}
			for(int idx = 1;idx<second.length();idx++){
				sbSecond.append(((sbSecond.charAt(idx-1)-'0')+(second.charAt(idx)-'0'))%10);
			}
			if(sbFirst.charAt(sbFirst.length()-1) != sbSecond.charAt(sbSecond.length()-1)){
				System.out.println(-1);
				continue;
			}
			int [][] LCS = new int [sbFirst.length()+1][sbSecond.length()+1];
			for (int row = 1;row<=sbFirst.length();row++){
				for (int col = 1;col<=sbSecond.length();col++){
					if (sbFirst.charAt(row-1)== sbSecond.charAt(col-1)){
						LCS [row][col] = LCS[row-1][col-1]+1;
					}else {
						LCS [row][col]  = Math.max(LCS[row][col-1],LCS[row-1][col]);
					}
				}
			}
			System.out.println(LCS[sbFirst.length()][sbSecond.length()]);
		}
		scan.close();
	}
}