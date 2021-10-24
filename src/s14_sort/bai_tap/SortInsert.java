package s14_sort.bai_tap;

public class SortInsert {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public void sortInsert(){
        for (int i=1;i<list.length;i++){
            int key = list[i];
            int j=i+1;
            while (j>=0&&list[i]>key){
                list[j+1]=list[j];
                j--;
            }
            list[j+1]=key;
        }
    }
}
