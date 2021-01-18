import java.util.*;

public class myArrayList<E> implements List<E>{

    private int size; //number of elements
    private E[] myArray;

    @SuppressWarnings("unchecked")
    public myArrayList(){
        myArray = (E[]) new Object[10]; //Typecast the new Object[] as any datatype E[]
        size = 0;
    }

    //returns the size of myArrayList
    public int size() {
        return size;
    }

    //returns  true if array myArrayList is empty, false otherwise.
    public boolean isEmpty() {
        return size == 0;
    }

    //returns true if o is an element of myArrayList, false otherwise
    public boolean contains(Object o) {

        for (E e : myArray) {
            if (e.equals(o)) {
                return true;
            }
        }
        return false;
    }

    //returns an iterator for myArrayList
    public Iterator<E> iterator() {

        E[] myArrayCopy = Arrays.copyOf(myArray, size);
        return Arrays.asList(myArrayCopy).iterator();
    }

    //returns an myArrayList as an array
    public Object[] toArray() {
        return (E[]) Arrays.copyOf(myArray, size);
    }

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

    //removes object o from myArrayList
    public boolean remove(Object o) {

        int index = indexOf(o);
        if(index == -1){
            return false;
        }
        remove(index);
        return true;
    }

    //clears myArrayList
    public void clear() {
        size = 0;
    }

    //returns element at index i
    public E get(int i) {
        return myArray[i];
    }

    //removes and returns element at index
    public E remove(int index) {
        E arrayListElement = get(index);
        for(int i = index; i < myArray.length-1; i++){
            myArray[i] = myArray[i + 1];
        }
        size--;
        return arrayListElement;
    }

    //returns a ListIterator for myArrayList
    public ListIterator<E> listIterator() {
        E[] myArrayCopy = Arrays.copyOf(myArray, size);
        return Arrays.asList(myArrayCopy).listIterator();
    }

    //returns a listIterator for myArrayLst
    public ListIterator<E> listIterator(int i) {
        E[] myArrayCopy = Arrays.copyOf(myArray, size);
        return Arrays.asList(myArrayCopy).listIterator(i);
    }

    //doubles the capacity of myArrayList
    public void resize(){
        E[] newArray = (E[]) new Object[myArray.length * 2];
        for(int i = 0; i <= myArray.length; i++){
            newArray[i] = myArray[i];
        }
        myArray = newArray;
    }

    //Returns true if the object equals myArrayList
    public boolean equals(Object o) {
        return this.equals(o);
    }

    //returns the index of the object o in myArrayList
    public int indexOf(Object o) {
        for (int i = 0; i<size; i++) {
            if (o.equals(myArray[i])) {
                return i;
            }
        }
        return -1;
    }

    /*
     *
     *Unsupported Methods
     *
     */

    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    public int hashCode() {
        throw new UnsupportedOperationException();
    }
    public List<E> subList(int i, int i1) {
        throw new UnsupportedOperationException();
    }
    public <E> E[] toArray(E[] ts) {
        throw new UnsupportedOperationException();
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }
}
