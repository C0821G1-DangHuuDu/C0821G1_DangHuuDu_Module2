package s10_list.bai_tap.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements=new Object[capacity];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(int index, E element){
        if(this.size>=elements.length){
            ensureCapa();
        }else{
            for (int i=size;i>index;i--){
                elements[size]=elements[size-1];
            }
            elements[index]=element;
        }


    }
}
