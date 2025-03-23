Question 1: With the aid of examples explain the rules of Big O notation in algorithm analysis (5 marks)

1. Drop constants- This is by mupltipling with contants or using lower order terms does not affect growth rate and they are irrelevant for large input sizes.

example
O(2n) should be stated as O(n)

2. Focus on the dominant Term- Only the term with the highest growth rate matters

example
n^2 + n + 10 = O(n^2)

3. Iterative Loops- A single loop iterating n times which is O(n). Their complexities are multiplied.

example
O(n) * O(n) = O(n^2)

4. Different terms for different inputs- When an algorithm takes multiple independent inputs, their copmlexities are combined.

example
O(n) + O(m) = O(n + m)

5. Recursive calls Multiply- Analyze recursive algorithms using recurrence relations

example
A binary search splits input in half each time: O(log n)


Question 2: Differentiate between arrays and linked lits in terms of :

1. Memory allocation
Array- Uses static memory allocation and all elements are stored next to each othere in memory
Linked list - Uses dynamic memory allocation and each element contains a value and a pointer to thr next element
2. Perfomance
Array- Faster for random access due to indexed memory
Linked list- are slowere to access specific elements but faster for insertions and deletions

3.Insertion and deletion operations
Arrays- Inserting and deleting an element requires shifting elements.
Linked lists- Insertion and deletion involves changing pointers and no shifting of elements is required.