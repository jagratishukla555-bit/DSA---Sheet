package HashMap;

import java.util.HashMap;

public class PutAndGet {


    public static void main(String[] args) {
        
    HashMap <String, Integer> map = new HashMap<>();
    map.put("Jagrati", 15);
    map.put("Krati", 25);
    map.put("Aakrati", 23);

    System.out.println(map.get("Krati"));
    System.out.println(map.containsKey("Jagrati"));
  
    }
}
