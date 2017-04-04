<h1>Team API </h1></br>
<h2>[roster?] </h2>

<h2> Methods Selections: </h2></br>
    <h3> offerFirst: </h3> </br>
    - offerFirst is a necessary part of the Deque interface because it allows us to insert an element at the beginning at either beginning of the Deque. We chose to write offerFirst instead of addFirst because we thought it would be useful for us to be able to check whether or not the thing we added was successful instead of having to look at the entire stack. 
    </br>
    offerLast - offerLast is a necessary part of the Deque interface because it allows us to insert an element at either end of the Deque. We chose to write offerLast instead of addLast because we thought it would be useful for us to be able to check whether or not the thing we added was successful instead of having to look at the entire stack.
    </br>
    pollFirst - pollFirst is a necessary part of the Deque interface because it returns the value at either front of the deque and removes it. We chose to write pollFirst over removeFirst because it can be used without having to throw an exception and instead just checks if the deque is empty. 
    </br>
    pollLast - pollLast is a necessary part of the deque interface because it returns the value at either end of the deque and removes it. We chose to write pollLast over removeLast because it can be used without having to throw an exception and instead just checks if the deque is empty. 
    </br>
    peekFirst - peekFirst is a necessary part of the deque interface because it allows us to see what the value at either of the fronts is. We chose to write peekFirst over getFirst because it can be used without having to throw an exception and instead just checks if the deque is empty and returns null.
    </br>
    peekLast - peekLast is a necessary part of the deque interface because it allows us to see what the value at either ends is. We chose to write peekLast over getLast because it can be used without having to throw an exception and instead just checks if the deque is empty and returns null.
    </br>

Why we chose LList:
