 <h1>Team API </h1>
 <h3>Pacy Yan, Iris Tao, Aryan Bhatt </h3></br>
 
 <h2>Why we chose DLList:</h2>
     - double-linked-list gives deque its double-linked feature because DLLNode offers both prev and next
     - (ie. methods like get/setPrev, get/setNext) 
     - It makes it a lot easier to implement the double-direction feature. 
     
 <h2> Methods Selections: </h2>
     <h3> addFirst: </h3>
     - offerFirst is a necessary part of the Deque interface because it allows us to insert an element at the beginning at either beginning of the Deque. We chose to write offerFirst instead of addFirst because we thought it would be useful for us to be able to check whether or not the thing we added was successful instead of having to look at the entire stack. 
     </br>
     <h3>addLast: </h3> </br>
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

     
<h2>Changes Made</h2></br>
     - We changed offerFirst and offerLast to addFirst and addLast in response to team BNTWomen's code review. The reason why the methods on the code and readme file didn't match the first time was because we changed our mind while coding but forgot to revise the readme file. Apologies for that. </br></br>
     - We moved the "Why we chose DLLNode" section from the bottom to the top of the file and got rid of the problem of that part being a code block instead of formatted text. The reason why that problem occurred remains unknown. But moving it up did give back did fix the formatting issue. </br></br>
     - Bugs fixed! We did not include a main method in the first place and so the code didn't compile. We added a main method with some test cases and fixed a lot of bugs in our code (typos, wrong variable and method names, incompatible return types, etc.) which we didn't discover before. Now the code compiles correctly and displays the test results. </br></br>
     - API updated! </br>



