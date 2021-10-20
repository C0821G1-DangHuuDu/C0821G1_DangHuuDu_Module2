package s12_map.thuc_hanh.hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Student {
    public static void main(String[] args) {
        Map<String,Integer> studentHashMap= new HashMap();
        studentHashMap.put("Du",31);
        studentHashMap.put("Bao",28);
        studentHashMap.put("Vy",27);
        studentHashMap.put("Dong",20);
        System.out.println("Display entries in HashMap");
        System.out.println(studentHashMap + "\n");

        Map<String,Integer> studentsTreeMap= new TreeMap<>(studentHashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(studentsTreeMap); //Tại sao không cần duyệt key vẫn hiển thị được các phần tử trong Map?

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        studentHashMap.put("Du",31);
        studentHashMap.put("Bao",28);
        studentHashMap.put("Vy",27);
        studentHashMap.put("Dong",20);
        System.out.println("\nThe age for " + "Vy is " + linkedHashMap.get("Vy"));// Không nhận được kết quả?
    }
}
