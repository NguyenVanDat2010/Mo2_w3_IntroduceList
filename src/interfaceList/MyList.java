package interfaceList;

public interface MyList<E> extends java.lang.Iterable<E> {
    public void add(E e);

    public void add(int index, E e);

    public void clean();

    public boolean contains(E e);

    public E get(int index);

    public int indexOf(E e);

    public boolean isEmpty();

    public int lastIndexOf(E e);

    public boolean remove(E e);

    public boolean remove(int index);

    public Object set(int index, E e);

    public int size();
}
