package s22_structural_design_pattern.bai_tap.facade_pattern;

import java.util.List;

public class ListPrinter {
    public static void printList(List<Integer> numbersList){
        for (Integer number: numbersList) {
            System.out.print(number+"\t");
        }
        System.out.print("\n");
    }
}
