import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    /* 
     DEQUEUE - Deck
     Add or Remove from both the sides
     Null Elements are not allowed
    */
   public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();//public interface Deque extends Queue
    deque.add(89);
    deque.addLast(99);
    deque.addFirst(9);
    deque.element();//Retrieves, but does not remove, the head of the queue
    //etc etc.
   } 
}
/*

 ArrayDeque class which is implemented in the collection framework provides us with a way to apply resizable-array. This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. Array deques have no capacity restrictions and they grow as necessary to support usage.

 Operations of Deque:
        1. add
        2.addFirst
        3.addLast
        4.contains
        5.descendingIterator
        6.element
        7.getFirst
        8.getLast
        9.iterator
        10.offer
        11.offerFirst
        12.offerLast
        13.peek
        14.peekFirst
        15.peekLast
        16.pop
        17.push
        18.removeFirst
        19.removeLast
        20.size

 */