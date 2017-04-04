//Team API
//Pacy Yan, Iris Tao, Aryan Bhatt
//LAB #02: All Hands on Deque!
//2017-04-04

/*
Class Euqed to implement interface Deque<D>
*/
public class Euqed<T> implements Deque<T>{

    private DLLNode<T> _front, _end;
    private int _size;

    public Euqued(){
	_size = 0;
    }


    
  
    /*-------------Begin Offer Methods[Iris]------------*/
    /*addFirst:
      ---inserts the specified element at the front of this deque if it is possible todo so immediately without violating capacity restrictions - returns a boolean if successful
    */

    public void addFirst(T x){
	DLLNode<T> newN = new DLLNode(x, null, _front);
	if (isEmpty()){
	    _front = newN;
	    _front.setNext(_end);
	    _end = _front;
	   
	}
	else{
	    _front.setPrev(newN);
	    _front = newN;

	   
	}
	_size ++;
    }
	    	
	

    /*addLast:
      ---inserts the specified element at the end of this deque if it is possible to do so without violating capacity restrictions - returns a boolean if successful
    */
    public void addLast(T x){
	DLLNode<T> newN = new DLLNode<T>(x, _end, null);
	
	if (isEmpy()){
	    _end = newN;
	    _end.setPrev(_front);
	    _front = _end;
	   
	}
	else{
	    _end.setNext(newN);
	    _end = newN;
	    
	}
	_size ++;
	   
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
	    DLLNode<T> temp = _front
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
	    DLLNode<T> temp = _end;
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
        
	return _front.getCargo();
    }
    /*peekLast:
      ---Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty*/
    public T peekLast(){
	return _end.getCarg();
    }
    /*-------------End Peek Methods------------*/
}
