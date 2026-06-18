
import java.util.Map; 
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        HashMap <Character, Integer> mp = new HashMap<>();

        for(char c: str.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        
        mp.forEach((k,v)-> System.out.println(k+ ":"+v));
    
    int max =0;
    char maxChar ='\0';

    for(Map.Entry<Character, Integer> e : mp.entrySet()){
        if(e.getValue()>max)
        {
            maxChar = e.getKey();
            max = e.getValue();
        }
    }

        System.out.println(maxChar+" came "+max+"times");
    
    
}
    
}
