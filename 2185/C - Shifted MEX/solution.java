import java.util.*;
public class Main{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while(num>0){
            int n = scan.nextInt();
            int [] arr = new int [n];
            TreeSet<Integer> set = new TreeSet<>();
            for(int i =0;i<n;i++){
                arr[i] = scan.nextInt();
            }
            
            for (int x : arr) {
                set.add(x);
            }
            List<Integer> list = new ArrayList<>(set);
            int currMex = 0;
            int maxMex =0;
 
            for (int i = 0;i<list.size()-1;i++){
                   if (list.get(i)+1 == list.get(i+1)){
                          currMex++;
                   } else {
                    maxMex = Math.max(currMex,maxMex);
                    currMex = 0;
                   }
            }
            System.out.println(Math.max(currMex+1, maxMex+1));
            num--;
        }
    }
}