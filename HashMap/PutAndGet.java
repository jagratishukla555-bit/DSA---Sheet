package HashMap;
import java.util.HashMap;
import java.util.Map;
public class PutAndGet{


    public static void main(String[] args) {
        
    HashMap <String, Integer> map = new HashMap<>();
    map.put("Jagrati", 15);
    map.put("Krati", 25);
    map.put("Aakrati", 23);

    System.out.println(map.get("Krati"));
    System.out.println(map.containsKey("Jagrati"));
     
    System.out.println(map.getOrDefault("shikha", 7));
    
    System.out.println(map.containsValue(10));

    for(Map.Entry<String, Integer> e: map.entrySet())
    {
        System.out.println(e.getKey()+ " ->" + e.getValue());
    }
  
    }
}
