package Loc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostAppearance {
    public static void main(String[] args) {
        char[] chars = "123412213".toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length ; i++) {
            map.put(chars[i],0);
        }
        for (int i = 0; i < chars.length ; i++) {
            if(map.containsKey(chars[i])){
                int value = map.get(chars[i]);
                map.put(chars[i],++value);
            }
        }
        System.out.println(map);
        System.out.println("---------------");
        Set<Character> keys = map.keySet();
        for (Character x : keys
             ) {
            System.out.println(x + " - " +map.get(x));
        }
        System.out.println("---------------");
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry x: entries
             ) {
            System.out.println(x.getKey()+" - "+x.getValue());
        }
    }
}
