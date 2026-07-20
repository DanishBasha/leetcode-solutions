import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            String str=sc.next();
            if(n%2!=0 && str.charAt(0)=='b'){
                System.out.println("No");
                continue;
            }
            int i=(n%2==0)?0:1;
            boolean found=false;
            for( ;i<n-1;i+=2){
                
                if(str.charAt(i)==str.charAt(i+1) &&(str.charAt(i)!='?' && str.charAt(i+1)!='?')){
                    System.out.println("No");
                    found=true;
                    break;
                }
                
            }
            if(found) continue;
            System.out.println("Yes");
        }
    }
}