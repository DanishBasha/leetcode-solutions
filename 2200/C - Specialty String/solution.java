import java.util.*;
public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int testCase = 1;testCase<= t;testCase++){
        int num = scan.nextInt();
        scan.nextLine();
        String s1 = scan.nextLine();
        Stack <Character> stack = new Stack<>();
        for (char ch : s1.toCharArray()){
           if (!stack.isEmpty() && stack.peek() == ch){
               stack.pop();
           }else {
            stack.push(ch);
           }
        }
        if (stack.isEmpty()){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
      }
    }
}