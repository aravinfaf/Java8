import java.util.HashMap;
import java.util.Map;

public class Ragul {

    public static void main(String[] args) {
        Map<String,String> stringMap = new HashMap<>();

        stringMap.put("Aravind","Android");
        stringMap.put("Ragul","Java");

        for(Map.Entry map : stringMap.entrySet()){
            System.out.println(map.getKey()+" : "+map.getValue());
        }
    }
}


