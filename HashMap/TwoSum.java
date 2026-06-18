import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class TwoSum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size:");
        int n= sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Array elements:");

        for(int i=0; i<n; i++)
            nums[i]= sc.nextInt();

        System.out.println("Target:");
        int target = sc.nextInt();

        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] r= new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int rest = target - nums[i];
            if(mp.containsKey(rest))
            {
                r[0] = mp.get(rest);
                r[1] = i;
            }
            else{
                mp.put(nums[i], i);
            }
        }
        for(int a: r){
            System.out.print(a);
        }


    }


}