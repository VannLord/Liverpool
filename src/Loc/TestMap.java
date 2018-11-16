package Loc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
        public static void main(String[] args) {
            Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Son", 19);
            hashMap.put("Dung", 20);
            hashMap.put("Van", 21);
            hashMap.put("Sang", 22);
            System.out.println("Show all elements in HashMap");
            System.out.println(hashMap);
            Map<String, Integer> treeMap = new TreeMap<>(hashMap);
            System.out.println("Show all in ascending order of key");
            System.out.println(treeMap);
            Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
            linkedHashMap.put("Son", 19);
            linkedHashMap.put("Dung", 20);
            linkedHashMap.put("Van", 21);
            linkedHashMap.put("Sang", 22);
            System.out.println("\nThe Son's age is " + linkedHashMap.get("Son"));
        }

        }
