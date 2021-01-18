import java.util.*;

public class myArrayList<E> implements List<E>{

    private int size; //number of elements
    private E[] myArray;

    @SuppressWarnings("unchecked")
    public myArrayList(){
        myArray = (E[]) new Object[10]; //Typecast the new Object[] as any datatype E[]
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0; //returns  true if array myArrayList is empty, false otherwise.
    }

    @Override
    public boolean contains(Object o) {

        for (E e : myArray) {
            if (e.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<E> iterator() {

        E[] myArrayCopy = Arrays.copyOf(myArray, size);
        return Arrays.asList(myArrayCopy).iterator();
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <E> E[] toArray(E[] ts) {
        return (E[]) Arrays.copyOf(myArray, size);
    }

    public boolean add(E e) {

        if(size == myArray.length){
            resize();
        }

        myArray[size] = e;
        size++;
        return true;

    }

    public boolean remove(Object o) {

        int index = indexOf(o);
        if(index == -1){
            return false;
        }
        remove(index);
        return true;
    }


    public void clear() {
        size = 0;
    }

    public boolean equals(Object o) {
        return false;
    }

    public E get(int i) {
        return myArray[i];
    }

    public E set(int i, E e) {
        return null;
    }

    public void add(int i, E e) {

    }

    public E remove(int index) {
        E arrayListElement = get(index);
        for(int i = index; i < myArray.length-1; i++){
            myArray[i] = myArray[i + 1];
        }
        size--;
        return arrayListElement;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<E> listIterator() {
        E[] myArrayCopy = Arrays.copyOf(myArray, size);
        return Arrays.asList(myArrayCopy).listIterator();
    }

    public ListIterator<E> listIterator(int i) {
        E[] myArrayCopy = Arrays.copyOf(myArray, size);
        return Arrays.asList(myArrayCopy).listIterator(i);
    }


    public void resize(){
        E[] newArray = (E[]) new Object[myArray.length * 2];
        for(int i = 0; i <= myArray.length; i++){
            newArray[i] = myArray[i];
        }
        myArray = newArray;
    }
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
}
