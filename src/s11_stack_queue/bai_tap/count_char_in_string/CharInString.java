package s11_stack_queue.bai_tap.count_char_in_string;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CharInString {
    public static void main(String[] args) {
        String string = "I am student in C0821G1 class";
        string=string.toUpperCase();
        System.out.println(string);
        int count=0;

        Map<Character,Integer> countCharacter = new TreeMap<>();

        Scanner input= new Scanner(System.in);
        System.out.print("Input char to check:");
        char character=input.next().charAt(0);


        for(int i =0;i<string.length();i++){
            if(string.charAt(i)== character){
                countCharacter.put(character,count=count+1);
            }
        }
        Set<Character> characters=countCharacter.keySet();
        for (Character chars:characters){
            System.out.println(countCharacter.get(chars));
        }
    }
}
