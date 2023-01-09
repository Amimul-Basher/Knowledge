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


        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(new ArrayList<>(deque)); // prints 3, 2, 1
    }
}
