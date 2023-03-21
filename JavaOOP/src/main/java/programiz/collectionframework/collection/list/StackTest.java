package programiz.collectionframework.collection.list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(new ArrayList<>(stack)); // prints 1, 2, 3
        //Problem is here. You can access any element you want But this is not the behaviour of a stack
        System.out.println(stack.get(2));


        Deque<Integer> stackDeque = new ArrayDeque<>();
        stackDeque.push(1);
        stackDeque.push(2);
        stackDeque.push(3);
        System.out.println(new ArrayList<>(stackDeque)); // prints 3, 2, 1
        int last  = stackDeque.pop();
        System.out.println(last);
        System.out.println(stackDeque.peek());

    }
}
