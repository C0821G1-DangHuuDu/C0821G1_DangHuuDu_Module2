package s10_list.thuc_hanh.list_example_1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
//        for(int i=0;i<listInteger.size();i++){ //tại sao ở đây .size() không được?
//            System.out.println(listInteger.get(i));
//        }
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

        listInteger.get(6);
        System.out.println("element 6: "+listInteger.get(6));
    }
}
