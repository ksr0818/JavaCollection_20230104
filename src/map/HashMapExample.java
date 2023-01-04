package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리",65);
        map.put("피죤투",15);

        System.out.println("총 entry 수" + map.size());

        System.out.println("파이리 : " + map.get("파이리"));

        Set<String> keySet = map.keySet();

        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }

            map.remove("피죤투");

            System.out.println("총 entry 수: " + map.size());

            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

            // entrySet을 순회하면서 value를 읽어옵니다.
            Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
            while(entryIterator.hasNext()) {
                Map.Entry<String, Integer> entry = entryIterator.next();
                String key = entry.getKey(); // Map.Entry 인터페이스의 메서드
                Integer value = entry.getValue(); // Map.Entry 인터페이스의 메서드
                System.out.println(key + " : " + value);
            }

            // 객체 전체 삭제
            map.clear();


        }

    }
