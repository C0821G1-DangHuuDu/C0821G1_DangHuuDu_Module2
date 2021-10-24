package s13_search.bai_tap;

import java.util.ArrayList;
import java.util.List;

public class LengthMax {
    public static void main(String[] args) {
        String a = "Welcome";
        char[] charArray = a.toCharArray();
        List strings = new ArrayList();
        for (int i = 0; i < charArray.length; i++) {
            String b = "";
            for (int j = i; j < charArray.length; j++) {
                if ((int)charArray[i] < (int)charArray[i + 1]) {//hàm này không được. Làm sao để so sánh kiểu ký tự?
                    b += charArray[i];
                } else {
                    break;
                }
            }
            strings.add(b);
        }
        System.out.println(strings);
    }

}
