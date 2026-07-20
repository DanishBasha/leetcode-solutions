import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int N=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            int count=1;
            for(int ind=1;ind<str.length();ind++){
                count++;
                if(str.charAt(ind)=='L') break;
            }
            System.out.println(count);
            
        }
    }
}