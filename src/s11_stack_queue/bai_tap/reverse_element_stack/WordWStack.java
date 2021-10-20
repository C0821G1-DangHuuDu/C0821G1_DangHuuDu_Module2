package s11_stack_queue.bai_tap.reverse_element_stack;

import java.util.Stack;

public class WordWStack {
    public static void main(String[] args) {
        Stack<String> wStacks = new Stack<>();
        String mWord="Incredible";
        mWord=mWord.toUpperCase();
        for (int i = 0; i < mWord.length(); i++) {
            wStacks.push(mWord.charAt(i)+" ");
        }
        System.out.println("Element of stacks:");
        for (int i = 0; i < wStacks.size(); i++) {
            System.out.print(wStacks.get(i) + "\t");
        }
        String mWord1="";
        System.out.print("\n");
        for (int i = 0; i < mWord.length(); i++) {
            mWord1+= wStacks.pop();
        }

        System.out.println("MWord after revese:");
        System.out.println(mWord1);
    }
}
