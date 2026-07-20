import java.util.*;
public class Main {
    static int[] dsum=new int[900001];
    static String[] vsum=new String[900001];
    static StringBuilder sb=new StringBuilder();
    private static int digit_sum(int num){
        sb.append(num);
        if(num<=9) return num;
        int sum=0;
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        return sum+digit_sum(sum);
    }
 
    private static void cal(){
        for(int pr=1;pr<900001;pr++){
            dsum[pr]=digit_sum(pr);
            vsum[pr]=sb.toString();
            sb.setLength(0);
        }
    }
    private static boolean contains(String vsum,String str){
        int[] freq=new int[10];
        for(char ch:vsum.toCharArray()) freq[ch-'0']++;
        for(char ch:str.toCharArray()) freq[ch-'0']--;
        for(int ind=0;ind<10;ind++){
            if(freq[ind]>0) return false;
        }
        return true;
    }
    private static String remove(String vsum,String str){
        StringBuilder sb=new StringBuilder();
        char[] v=vsum.toCharArray();
        char[] s=str.toCharArray();
        
        Arrays.sort(v);
        Arrays.sort(s);
        int i=v.length-1;
        for(int ind=s.length-1;ind>=0;ind--){
            if(i>=0 && v[i]==s[ind]){
                i--;
                continue;
            }
            sb.append(s[ind]);
        }
        
        
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            cal();
            int N=sc.nextInt();
            sc.nextLine();
            while(N-->0){
                String str=sc.nextLine();
                
                if(str.length()==1){
                    System.out.println(str);
                    continue;
                }
                int sum=0;
                for(char ch:str.toCharArray()) sum+= ch-'0';
                boolean found=false;
                for(int pri=1;pri<900001;pri++){
                    int dif=sum-dsum[pri];
                    if(pri==dif){
                        if(contains(vsum[pri],str)){
                            String rem=remove(vsum[pri],str);
                            System.out.println(rem+vsum[pri]);
                            
                            break;
                        }
                    }
                }
            }
 
    }
}