import java.util.Scanner;
import java.util.*;

class StackOprs{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int n=5;
        for(int i=0; i<n; i++)
        {
            int s = sc.nextInt();
            stk.push(s);
        }
        for(int i=0; i< n; i++)
        {
            System.out.println(stk.peek());
            stk.pop();
        }
        
     }
} 