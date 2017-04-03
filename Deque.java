/*
    Write your own local Deque interface.

    Include all methods your trio plans to implement.
    Comment out all methods.
*/

public interface Deque<D>{
    /*-------------Begin Add Methods[Iris]------------*/
    /*addFirst:
    ---inserts the specified element at the front of this deque if it is possible todo so immediately without violating capacity restrictions.
    */
    public void addFirst(T x){

    }
    /*addLast:
    ---inserts the specified element at the end of this deque if it is possible to do so without violating capacity restrictions
    */
    public void addlast(T x){

    }
    /*-------------End Add Methods------------*/



    /*-------------Begin Poll Methods[Pacy]------------*/
    /*pollFirst:
    ---retrieves and removes the first element of this deque, or returns null if this deque is empty.*/
    public T pollFirst(){

    }
    /*pollLast:
    ---retrieves and removes the last element of this deque, or returns null if this deque is empty*/
    public T pollLast(){

    }
    /*-------------End Poll Methods------------*/



    /*-------------Begin Peek Methods[]------------*/

    /*peekFirst:
      ---Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty*/
    public T peekFirst(){
	
    }
    /*peekLast:
      ---Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty*/
    public T peekLast(){
	
    }
    /*-------------End Peek Methods------------*/
}
