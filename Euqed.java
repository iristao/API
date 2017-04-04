//Team API
//Pacy Yan, Iris Tao, Aryan Bhatt
//LAB #02: All Hands on Deque!
//2017-04-04

/*
Class Euqed to implement interface Deque<D>
*/
public class Euqed<T> implements Deque<T>{

    private LLNode<T> _front, _end;
    private int _size;

    public Euqued(){
	_size = 0;
    }


    
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
	if(_size == 0){
	    return null;
	}
	else{
	    LLNode<T> temp = _front
	    for(int x = 0; x < _size; x ++){
		temp = temp.getNext();
	    }
	}
	return temp.getValue();
	_front = _front.getNext();
    }
    /*pollLast:
      ---retrieves and removes the last element of this deque, or returns null if this deque is empty*/
    public T pollLast(){
	if(_size == 0){
	    return null;
	}
	else{
	    LLNode<T> temp = _end;
	    for(int x = _size; x > 0; x --){
		temp = temp.getNext();
	    }
	}
	return temp.getValue();
	_end = _end.getNext();
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
