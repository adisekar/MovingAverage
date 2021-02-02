# MovingAverage

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

Minimum Requirements
Provide a separate interface (IE interface/trait) with documentation for the data structure
Provide an implementation for the interface
Provide any additional explanation about the interface and implementation in a README file.

Solution - 

The interface (IMovingAverage) has the following methods

1. double getMovingAverage();
2. void addElement(int val);
3. void printElements();
4. List<Integer> getElements();

The internal implementation uses a circular queue implemented by an array of size N.
As queue operates in FIFO (First In First out), so only the last N elements remain in the queue.

As a new element from the stream comes in, the new total and average is cacluated. (Enqueue)
As a new element is removed from the stream, the new total and average is cacluated. (Dequeue)

Since queue is of size N, and if it full, before instering new element, it Dequeue's an element from the queue and inserts another element.

Reason for choosing Circular Queue - 
1. Instead of a circular queue, if we use a regular queue, as elements are removed (dequeued) we need to shift the other elements, 
so we dont have empty spots. But using circular queue, empty spots are filled as new elements are inserted there in a circular way.

Reason for choosing Array implementation -  
1. Queue can also be implemented using Linked List, but this array implementation is better for memory, as no 
need of previous/next nodes on each Node of linked list.
2. Get access of elements is also required. Using linked list is not possible, unless we use a Hashmap of pointers to linked list nodes and its position.
Array gives us the ability for Get access for each element, by say last element or 2nd last element etc. 

Complexity Analysis - 
Moving Average - The worst case complexity for this is O(1). Getting Moving average anytime is just in constant time. 
Add Element - The worst case complexity for this is O(1). As we just need to add the element to the array.
Get Elements - The worst case complexity for this is O(N), N being the size of last N elements. It loops through the internal queue array to get the elements.
Get Element - The worst case complexity for this is O(1), as we just need to get the element in the array knowing the position of array index.

