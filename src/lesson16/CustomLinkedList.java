package lesson16;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomLinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;

    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return find(o) != null;
    }

    private Node<T> find(Object o) {
        Node<T> curr = first;
        while (true) {
            if (curr == null) {
                return null;
            }
            if (curr.item.equals(o)) {
                return curr;
            }
            curr = curr.next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        Node<T> node = new Node<>();
        node.item = t;

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<T> toRemove = find(o);
        if (toRemove == null) return false;
        Node<T> prev = toRemove.prev;
        Node<T> next = toRemove.next;

        if (prev != null) {
            prev.next = next;
        } else {
            if (next != null) {
                next.prev = null;
                first = next;
            }
        }

        if (next != null) {
            next.prev = prev;
        } else {
            if (prev != null) {
                prev.next = null;
                last = prev;
            }
        }

        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        int initSize = size;
        for (T o : c) {
            add(o);
        }
        return size != initSize;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {

        Node<T> nodeByIndex = getNodeByIndex(index);
        if (nodeByIndex == null) {
            return addAll(c);
        }
        int sizeStart = size;
        int counter = index;
        for (T t : c) {
            add(counter++, t);
        }

        return sizeStart != size;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        last = null;
        first = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (isEmpty()) return null;
        if (index == 0) return first.item;
        if (index == size - 1) return last.item;
        Node<T> curr = getNodeByIndex(index);
        return curr.item;
    }

    private Node<T> getNodeByIndex(int index) {
        Node<T> curr = first;
        for (int i = index; i < size; i++) {
            curr = curr.next;
        }
        return curr;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
        Node<T> nodeByIndex = getNodeByIndex(index);
        Node<T> prev = nodeByIndex.prev;
        Node<T> tnode = new Node<T>();
        tnode.prev = prev;
        tnode.next = nodeByIndex;
        nodeByIndex.prev = tnode;
        tnode.item = element;
        size++;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    class Node<T> {
        private Node<T> prev;
        private Node<T> next;
        private T item;
    }
}
