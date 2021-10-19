package s11_stack_queue.bai_tap.reverse_element_stack;

import java.util.Stack;

public class IntegerStack {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        int[] integer = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < integer.length; i++) {
            stacks.push(integer[i]);
        }

        System.out.println("Element of stacks:");
        for (int i = 0; i < stacks.size(); i++) {
            System.out.print(stacks.get(i) + "\t");
        }

        System.out.print("\n");
        for (int i = 0; i < integer.length; i++) {
            integer[i] = stacks.pop();
        }

        System.out.println("Integer after revese:");
        for (int i = 0; i < integer.length; i++) {
            System.out.print(integer[i] + "\t");
        }


    }

}
