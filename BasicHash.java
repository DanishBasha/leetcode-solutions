public class BasicHash {
    public static void main(String[] args) {
        int Q = 12;
        int N = 5;
        int [] arr = {4,3,2,1,4};
        int [] hash = new int[13];
        for (int i = 0;i<=4;i++ ){
            hash[arr[i]]++;
        }
        for (int i = 0;i<13;i++){
            if(hash[i] > 0){
                System.out.println(i+" has occured "+hash[i]+" times");
            }
        }

    }
}