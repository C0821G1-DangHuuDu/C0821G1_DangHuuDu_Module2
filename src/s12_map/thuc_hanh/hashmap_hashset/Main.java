package s12_map.thuc_hanh.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Du",31,"QN");
        Student student2=new Student("Bao",28,"DN");
        Student student3=new Student("Vy",27,"DN");
        Student student4=new Student("Dong",20,"QN");

        System.out.println("Display student list with HashMap");
        Map<Integer,Student> hashMap=new HashMap<>();
        hashMap.put(1,student1);
        hashMap.put(2,student2);
        hashMap.put(3,student3);
        hashMap.put(4,student4);
        Set<Integer> keyHashMap=hashMap.keySet();
        for (Integer number:keyHashMap){
            System.out.println(hashMap.get(number));
        }

        System.out.println("Display student list with HashSet");
        Set<Student> hashSet=new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);

        for(Student student:hashSet){
            System.out.println(student);
        }
    }
}
