/*
    Write your own local Deque interface.

    Include all methods your trio plans to implement.
    Comment out all methods.
*/

public interface Deque<E>{
    /*inserts an element at the front the deque*/
    public void addFirst(E x);

    /*inserts an element at the end of the deque*/
    public void addLast(E x);



    /*returns and removes the first element of the deque - returns null if deque is empty*/
    public E pollFirst();

    /*returns and removes the last element of the deque - returns null if deque is empty*/
    public E pollLast();


    /*returns the first element of the deque - returns null if deque is empty*/
    public E peekFirst();

    /*returns the last element of the deque - returns null if deque is empty*/
    public E peekLast();
}
