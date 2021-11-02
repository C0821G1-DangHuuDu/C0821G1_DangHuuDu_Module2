package s22_structural_design_pattern.bai_tap.facade_pattern;

import java.util.ArrayList;
import java.util.List;

public class RandomListFacade {

public static void printRandomEvenList(){
    RandomList randomList = new RandomList();
    List<Integer> integerList = new ArrayList<>();
    System.out.println("Tạo một danh sách số nguyên với các giá trị ngẫu nhiên:");
    integerList=randomList.generateList(10,50,0);
    ListPrinter.printList(integerList);
    System.out.println("Loại bỏ các phần tử là số lẻ và hiển thị các số chẵn còn lại:");
    integerList=ListFilter.filterOdd(integerList);
    ListPrinter.printList(integerList);
}
}
