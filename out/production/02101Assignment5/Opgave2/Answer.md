# Exercise 2

### 5-2-1
Elements in the ArrayList are added to the end of the end of the list, so that the newest element is in the back of the list, with the highest index (size of list - 1). 
Therefore, just before the first *myst()* call, ArrayList *a* will contain the following elements in order of index: { 40, 41, 42 }.

### 5-2-2
Before the described recursive call to itself, *myst()* pops the last element off the ArrayList and prints it. 
Therefore, the contents of ArrayList *a* before the recursive call must be { 40, 41 } for the first and { 40 } for the second. There is no third, as the if-block is not executed again because *size()* of *a* returns 0.

### 5-2-3
To achieve the modified printed output described, I would simply pass 0 as the parameter in the call to *a.remove()* nested in the print statement. This would result in the first index being removed and printed each time instead of the last.
E.g. -> { 40, 41, 42 }.