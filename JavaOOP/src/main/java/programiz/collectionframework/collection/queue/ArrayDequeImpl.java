package programiz.collectionframework.collection.queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeImpl {

    public static void main(String[] args){
        Deque<String> arrayDeque = new ArrayDeque();
        arrayDeque.offer("Shafa");
        arrayDeque.offer("Afreen");
        arrayDeque.offer("Ayaat");
        arrayDeque.offer("Ranju");
        System.out.println(arrayDeque);
        System.out.println("Polling " +arrayDeque.poll());
        System.out.println(arrayDeque);

    }
}
