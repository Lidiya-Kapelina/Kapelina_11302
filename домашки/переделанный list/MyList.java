package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class MyList<T> implements List<T> {
    private T[] values;
    private int size;

    MyList() {
        this.values = (T[]) new Object[100];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {

        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < this.size(); i += 1) {
            if (this.values[i] == (T) o) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean add(T t) {

        if (this.values.length >= size) {
            this.values[size] = t;

        } else {
            T[] saving = this.values;
            this.values = (T[]) new Object[saving.length + 100];
            for (int i = 0; i < saving.length; i += 1) {
                this.values[i] = saving[i];
            }
            this.values[saving.length] = t;
        }
        this.size += 1;

        return true;
    }

    @Override
    public boolean remove(Object o)  {
        if (this.contains(o)) {
            boolean flag = false;
            for (int i = 0; i < this.size - 1; i += 1) {
                if (this.values[i] == (T) o && flag == false) {
                    this.values[i] = null;
                    flag = true;
                }
                if (flag == true) {
                    this.values[i] = this.values[i + 1];
                }

            }
            this.size -= 1;
            return true;
        }
        return false;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (this.size - 1 >= index) {
            return this.values[index];
        }
        throw new IndexOutOfBoundsException("данного значения нет");

    }

    @Override
    public void add(int index, T element) {
        T[] saving = this.values;
        if (index >= size && index < this.values.length) {
            this.values[index] = element;
        } else {
            if (index >= size && index >= this.values.length) {
                this.values = (T[]) new Object[index + 100];
                for (int i = 0; i < saving.length; i += 1) {
                    this.values[i] = saving[i];

                }
                this.values[index] = element;
            } else {
                this.values = (T[]) new Object[index + 100];

                int y = 0;
                while (y != index) {
                    this.values[y] = saving[y];
                    y += 1;
                }
                this.values[index] = element;
                for (int i = index + 1; i < size + 1; i += 1) {
                    this.values[i] = saving[i - 1];
                }
            }
        }
        this.size += 1;
    }

    @Override
    public T remove(int index) throws NullPointerException {
        if (this.size() < index) {
            throw new NullPointerException("такого индекса нет");
        }
        T value = this.values[index];
        for (int i = index; i < size - 1; i += 1) {
            this.values[i] = this.values[i + 1];
        }
        this.size -= 1;
        return value;
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