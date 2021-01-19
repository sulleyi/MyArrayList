
# myArrayList<T>
## Demonstration from Java Interludes 1-8
## [Github Link For Code](https://github.com/sulleyi/MyArrayList)

This repository uses some of the concepts explained in Java Interludes 1-8. I have written my own myArrayList<T> class, 
which  implements the List<T> interface. This project uses generics, polymorphism, interface 
implementation, iterators, inheritence. If you implemened an orderedArrayList it could also quickly encompass mutable and immutable objects as well.



### Generics and Interfaces
'''

    import java.util.*;

    public class myArrayList<E> implements List<E>{

    }

'''

This class uses generics so it can be used to store any object. This class implements the List<E> interface. 

### Iterators

'''

    //returns true if o is an element of myArrayList, false otherwise
    public boolean contains(Object o) {

        for (E e : myArray) {
            if (e.equals(o)) {
                return true;
            }
        }
        return false;
    }
    
'''

In the enhanced for loop, the iterator takes advantage of the properties of the List interface.


### Exceptions 

'''

    //adds element e to myArrayList
    public boolean add(E e) {

       //A contrived example of a try, catch, finally block
        try{
            myArray[size] = e;
        }
        catch(IndexOutOfBoundsException exception){
            resize();
            myArray[size] = e;
        }
        finally {
            size++;
        }
        return true;
    }
    
'''

While this example is slighty contrived, I used it for the sake of this demonstration. In the add function, you can take advantage of the IndexOutOfBoundsException to resize your array appropriately. If add() fails to append the element to the array, it first resizes the array and then tries again in the catch block. In the finally block, the size is updated.

I extensively referenced the [Oracle Java Docs](https://docs.oracle.com/en/java/) while writing this class.

I affirm that I have carried out my academic endeavors with full academic honesty. [Signed, Ian Sulley]
