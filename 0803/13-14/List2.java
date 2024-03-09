package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class List2<T> implements List<T> {
    private T[] values;

    List2() {
        this.values = (T[]) new Object[0];
    }

    @Override
    public int size() {
        return this.values.length;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (this.isEmpty() != true) {
            for (int i = 0; i < this.size(); i += 1) {
                if (this.values[i] == (T) o) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean add(T t) {
        T[] sohr = this.values;
        this.values = (T[]) new Object[sohr.length + 1];
        for (int i = 0; i < sohr.length; i += 1) {
            this.values[i] = sohr[i];
        }
        this.values[sohr.length] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (this.contains(o)) {
            for (int i = 0; i < this.size(); i += 1) {
                if (this.values[i] == (T) o) {
                    this.values[i] = null;//удаляем полностью ячейку в памяти!надо
                    return true;
                }
            }
        }
        System.out.println("данного значения нет");
        return true;
    }
    @Override
    public T get(int index) {
        try {
            if (this.size() - 1 >= index)
                return this.values[index];
        } catch (Exception e) {
            System.out.println("данного значения нет");
        }
        return null;
    }
    @Override
    public void add(int index, T element) {//gthtcvjnhtnm
        T[] dop = this.values;
        this.values = (T[]) new Object[dop.length + 1];
        for (int i = 0; i < index; i += 1) {
            if (dop.length > i) {
                this.values[i] = dop[i];
            } else {
                this.add(null);
            }
        }
        this.values[index] = element;
        for (int i = index; i < dop.length; i += 1) {
            this.values[i + 1] = dop[i];
        }
    }
    @Override
    public T remove(int index) {
        this.values[index] = null;
        return null;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }
    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
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
    public T set(int index, T element) {
        return null;
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

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }
}