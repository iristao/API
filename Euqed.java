//Team API
//Pacy Yan, Iris Tao, Aryan Bhatt
//LAB #02: All Hands on Deque!
//2017-04-12 (updated)

/*
Class Euqed to implement interface Deque<D>
*/

import java.util.NoSuchElementException;
public class Euqed<E> implements Deque<E>{

    private DLLNode<E> _front, _end;
    private int _size;

    public Euqed(){

	_size = 0;
    }


    
  
    /*-------------Begin Offer Methods[Iris]------------*/
    /*addFirst:
      ---inserts the specified element at the front of this deque if it is possible todo so immediately without violating capacity restrictions - returns a boolean if successful
    */

    public void addFirst(E x){
	DLLNode<E> newN = new DLLNode(x, null, _front);
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
    public void addLast(E x){
	DLLNode<E> newN = new DLLNode<E>(x, _end, null);
	
	if (isEmpty()){
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
    public E pollFirst(){
	if (isEmpty()){
	    return null;
	}
	else{
	    DLLNode<E> temp = _front;
	    removeFirst();
	    return temp.getCargo();
	}
    }

    
    /*pollLast:
      ---retrieves and removes the last element of this deque, or returns null if this deque is empty*/
    public E pollLast(){
	if (isEmpty()){
	    return null;
	}
	else{
	    DLLNode<E> temp = _end;
	    removeLast();
	    return temp.getCargo();
	}
    }
    /*-------------End Poll Methods------------*/
    
    
    
    /*-------------Begin Peek Methods[]------------*/
    
    /*peekFirst:
      ---Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty*/
    public E peekFirst(){
        
	return _front.getCargo();
    }
    /*peekLast:
      ---Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty*/
    public E peekLast(){
	return _end.getCargo();
    }
    /*-------------End Peek Methods------------*/



    public boolean isEmpty(){
	if (_size == 0){
	    return true;
	}
	else{
	    return false;
	}
    }



    public E removeFirst(){
	DLLNode<E> dup = _front;
	
	if (_size <= 0){
	    throw new NoSuchElementException();
	}
	else if (_size == 1){
	    _front = null;
	    _end = null;
	}
	else{
	    _front = _front.getNext();
	    _front.setPrev(null);
	}

	_size -= 1;
	return dup.getCargo();
    }
    


    public E removeLast(){
	DLLNode<E> dup = _end;
	if (_size == 0){
	    throw new NoSuchElementException();
	}
	else if (_size == 1){
	    _front = null;
	    _end = null;
	}
	else{
	    _end = _end.getPrev();
	    _end.setNext(null);
	}

	_size -= 1;
	return dup.getCargo();
    }


    public String toString(){
	String retStr = "";
	DLLNode<E> ptr  = _front;

	while (ptr != null){
	    retStr += ptr.getCargo() + " ";
	    ptr = ptr.getNext();
	}
	return retStr;
    }

     public static void main(String[] args){
	
        Euqed<String> d = new Euqed<String>();

	//============= addFirst
	//inserts an element at the front of the deque, return void
	//[] -> [apple]
	//[apple] -> [bigApple, apple]
	
	
	d.addFirst("apple");
	d.addFirst("bigApple");
	System.out.println("addFirst...\nreturn: \n" + "void");
	System.out.println( d + "\n");

	//============= addLast
	//inserts an element at the end of the deque, return void
	//[bigApple, apple] -> [bigApple, apple, smallApple]

	d.addLast("smallApple");
	System.out.println("addLast...\nreturn: \n" + "void");
	System.out.println( d + "\n");

	//============= pollFirst
	//removes the first element of the deque
	//return the removed element (return null if empty)
	//[bigApple, apple, smallApple] -> [apple, smallApple]
	//return: bigApple
	
	System.out.println("pollFirst...\nreturn: \n" + d.pollFirst());
	System.out.println( d+ "\n");



	//============= peekFirst
	//returns the first element of the deque - returns null if deque is empty
	//[apple, smallApple] -> [apple, smallApple]
	//return: apple

	System.out.println("peekFirst...\nreturn: \n" + d.peekFirst());
	System.out.println(d+ "\n");



	//============= removeFirst
	//removes the first element of the deque 
	//return the removed element (throw exception if empty)
	//[bigApple, apple, smallApple] -> [apple, smallApple]
	//return: bigApple
	
	System.out.println("removeFirst...\nreturn: \n" + d.removeFirst());
	System.out.println( d+ "\n");


	
    }
}
