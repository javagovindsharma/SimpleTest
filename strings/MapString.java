package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Govind on 2/05/2017
 */
public class MapString {

    public static Map<String,String> findGrandParentRelation(Map<String,String> map){
        Map<String,String> gpMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String nextValue = map.get(value);
            if(nextValue != null)
                gpMap.put(key,nextValue);
        }
        return gpMap;
    }

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + "->" + pair.getValue());
        }
    }

    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        Map<String,String> gpMap;
        map.put("a","b");
        map.put("c","d");
        map.put("d","e");
        map.put("b","f");
        map.put("g","k");
        map.put("l","h");
        map.put("f","j");
        gpMap = findGrandParentRelation(map);
        printMap(gpMap);
    }



}
