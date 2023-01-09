package programiz.collectionframework.collection;
//Collection interface have three subinterface: List, Set, Queue
//Methods of collection:
//add()
//addAll()
//remove()
//removeAll()
//size()
//iterator()
//clear()

//ArrayList, Vector, Stack, LinkedList implements List, But LinkedList implements queue as well
//Methods of list:
//get()
//set()
//toArray()
//contains()

//Methods of ArrayList:
//sort()
//clone()
//indexOf()
//isEmpty()

//Convert arrayList to array and vice versa

//Its good not to use vector, use ArrayList instead. Check this https://www.programiz.com/java-programming/vector

//We should use ArrayDeque instead stack, Because stack extends vector. We can access any position element from stack.
// Stack has no interface, so if you know you need Stack operations you end up committing to a specific concrete class, which
// isn't usually a good idea.



//??????Queue?????????

//ArrayDeque, LinkedList, PriorityQueue implements Queue

//Method of Queue:
//add() add specified element, if the task is successful returns true else returns exception
//offer() add specified element, if the task is successful returns true else returns false

//element() returns the head of the queue, if queue is empty then returns exception
//peek() returns the head of the queue, if queue is empty then returns null

//remove() The same way like before,using poll is a good practice. It returns null not exception
//poll()

public class Test {
}
