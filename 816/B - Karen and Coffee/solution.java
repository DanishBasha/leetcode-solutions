import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int Q=sc.nextInt();
        final int max=200002;
        int[] arr = new int[max];
        for(int i=0;i<N;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            arr[l]++;
            arr[r+1]--;
        }
        for(int p=1;p<max;p++){
            arr[p]+=arr[p-1];
        }
        int[] op=new int[max];
        for(int p=1;p<max;p++){
            if(arr[p]>=K){
                op[p]=op[p-1]+1;
            }else{
                op[p]=op[p-1];
            }
        }
        for(int i=0;i<Q;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(op[b]-op[a-1]);
        }
        
    }
}