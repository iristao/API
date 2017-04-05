 <h1>Team API </h1></br>
 <h2>Pacy Yan, Iris Tao, Aryan Bhatt </h2>
 <h2> Methods Selections: </h2></br>
     <h3> offerFirst: </h3>
     - offerFirst is a necessary part of the Deque interface because it allows us to insert an element at the beginning at either beginning of the Deque. We chose to write offerFirst instead of addFirst because we thought it would be useful for us to be able to check whether or not the thing we added was successful instead of having to look at the entire stack. 
     </br>
     <h3>offerLast: </h3> </br>
     - offerLast is a necessary part of the Deque interface because it allows us to insert an element at either end of the Deque. We chose to write offerLast instead of addLast because we thought it would be useful for us to be able to check whether or not the thing we added was successful instead of having to look at the entire stack.
     </br>
     <h3>pollFirst: </h3> </br> 
     - pollFirst is a necessary part of the Deque interface because it returns the value at either front of the deque and removes it. We chose to write pollFirst over removeFirst because it can be used without having to throw an exception and instead just checks if the deque is empty. 
     </br>
     <h3>pollLast: </h3> </br>
     - pollLast is a necessary part of the deque interface because it returns the value at either end of the deque and removes it. We chose to write pollLast over removeLast because it can be used without having to throw an exception and instead just checks if the deque is empty. 
     </br>
     <h3>peekFirst: </h3> </br>
     - peekFirst is a necessary part of the deque interface because it allows us to see what the value at either of the fronts is. We chose to write peekFirst over getFirst because it can be used without having to throw an exception and instead just checks if the deque is empty and returns null.
     </br>
     <h3>peekLast: </h3> </br>
     - peekLast is a necessary part of the deque interface because it allows us to see what the value at either ends is. We chose to write peekLast over getLast because it can be used without having to throw an exception and instead just checks if the deque is empty and returns null.
     </br>

     <h2>Why we chose DLList:</h2></br>
     - double-linked-list gives deque its double-linked feature because DLLNode offers both prev and next
     - (ie. methods like get/setPrev, get/setNext) 
     - It makes it a lot easier to implement that double-direction feature. 





