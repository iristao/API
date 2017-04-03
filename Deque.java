/*
    Write your own local Deque interface.

    Include all methods your trio plans to implement.
    Comment out all methods.
*/

public interface Deque<D>{
    /*inserts an element at the front the deque*/
    public void addFirst(T x);

    /*inserts an element at the end of the deque*/
    public void addlast(T x);



    /*returns and removes the first element of the deque - returns null if deque is empty*/
    public T pollFirst();

    /*returns and removes the last element of the deque - returns null if deque is empty*/
    public T pollLast();


    /*returns the first element of the deque - returns null if deque is empty*/
    public T peekFirst();

    /*returns the last element of the deque - returns null if deque is empty*/
    public t peekLast();
}
