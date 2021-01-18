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

    public <T> T[] toArray(T[] ts) {
        return null;
    }

    public boolean add(E e) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    public void clear() {

    }

    public boolean equals(Object o) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public E get(int i) {
        return null;
    }

    public E set(int i, E e) {
        return null;
    }

    public void add(int i, E e) {

    }

    public E remove(int i) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<E> listIterator() {
        return null;
    }

    public ListIterator<E> listIterator(int i) {
        return null;
    }

    public List<E> subList(int i, int i1) {
        return null;
    }
}
