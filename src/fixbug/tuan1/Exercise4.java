package fixbug.tuan1;

public class Exercise4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        if (a++ > 2 && ++b < 3){
            a += 1;
        }

        System.out.println(a);
        System.out.println(b);

        /*Câu 5: Tại line 7 nếu thay || thành && thì kết quả tại line 11 và 12 có khác nhau không ?
        * giải thích ?*/
    }
}
