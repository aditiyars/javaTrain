import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcerciseTwo {
    public static void soalVI(List<String> strings){
        // init
        Map <String, Boolean> stringCountMap = new HashMap<>();
        
        // cek value
        for (String str : strings) {
            if (stringCountMap.containsKey(str)) {
                stringCountMap.put(str, true);
            } else {
                stringCountMap.put(str, false);
            }
        }
        
       System.out.println(stringCountMap);
    }

    public static void soalVII(String[] arr){
        Map <String, String> map = new HashMap<>();
        
        for (String string : arr) {
            
            String firstChar = string.valueOf(string.charAt(0));
            String lastChar = string.valueOf(string.charAt(string.length()-1));
            map.put(firstChar, lastChar);    
        }

        System.out.println(map);
    }

    public static void soalVIII(Map<String, String> map){
        if(map.containsKey("b")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        System.out.println(map);

    }

    public static void soalIX(Map<String, String> map){
        String a = map.get("a");

        if(a != ""){
            map.put("b", a);
        }

        System.out.println(map);
    }

    public static void soalX(int smallSticks, int bigSticks, int targetLong){
        if(smallSticks + (bigSticks*5) >= targetLong){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }


}
