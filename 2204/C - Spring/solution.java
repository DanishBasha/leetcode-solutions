import java.util.*;
public class Main {
    private static long hcf(long a,long b){
        return (b==0)?a:hcf(b,a%b);
    }
    private static long lcm(long a,long b){
        return (a*b)/hcf(a,b);
    }
    private static long lcmofthree(long a,long b,long c){
        return lcm(lcm(a,b),c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            long A=sc.nextLong();
            long B=sc.nextLong();
            long C=sc.nextLong();
            long days=sc.nextLong();
            long abc=days/(lcmofthree(A,B,C));
            long ab=(days/(lcm(A,B)))-abc;
            long ac=(days/(lcm(A,C)))-abc;
            long bc=(days/(lcm(B,C)))-abc;
            long ansA=(days/A)*6-((abc*4)+(ab*3)+(ac*3));
            long ansB=(days/B)*6-((abc*4)+(ab*3)+(bc*3));
            long ansC=(days/C)*6-((abc*4)+(ac*3)+(bc*3));
            System.out.println(ansA+" "+ansB+" "+ansC);
            
 
        }
 
    }
}