package s10_list.bai_tap.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(0, 10);
        listInteger.add(12);
        listInteger.add(15);
        listInteger.add(2,20);

        for (int i=0; i <listInteger.size(); i++){
            System.out.println("Element "+(i+1)+": "+listInteger.get(i);
        }

        System.out.println(listInteger.get(2));
        listInteger.indexof(15);


    }
}
