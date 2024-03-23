import java.util.Objects;

class VectorCode {
    int length;
    List list;

    VectorCode(int[] arr) {
        List list = new List();
        length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
                list.add(i + 1);
            }
        }
    }

    int[] decode() {
        int length = this.length;
        int[] array = new int[length];
        for (int i = 0; i < length; i += 1) {
            if (list.head.next.data == i + 1) {
                array[i] = list.head.data;
            } else {
                array[i] = 0;
            }
            list.head = list.head.next.next;

        }
        return array;
    }

    void insert(int k, int pos) {
        for (int i = 0; i < (pos - 1) * 2; i++) {
            list.head = list.head.next;
        }
        Element el = new Element();
        el.data = k;
        el.next = list.head.next.next.next;
        list.head.next = el;
    }

    void delete(int pos) {
        for (int i = 0; i < (pos - 1) * 2; i++) {
            list.head = list.head.next;
        }
        list.head.data = 0;
        list.head = list.head.next;
        list.head.data = 0;
    }

    int scalarProduct(VectorCode v) {
        int scalarProduct = 0;
        while (!Objects.equals(list.head, list.tail)) {
            scalarProduct += list.head.data * v.list.head.data;

            list.head = list.head.next;
            v.list.head = v.list.head.next;

        }
        scalarProduct += list.head.data * v.list.head.data;
        return scalarProduct;
    }

    VectorCode sum(VectorCode v) {
        VectorCode va = v;
        while (!Objects.equals(list.head, list.tail)) {
            va.list.head.data = list.head.data + v.list.head.data;
            list.head = list.head.next;
            v.list.head = v.list.head.next;
        }
        va.list.head.data = list.head.data + v.list.head.data;
        return va;
    }
    VectorCode vectorSum() {
        int[] ar = new int[length];
        int k = 0;
        while (!Objects.equals(list.head, list.tail)) {
            for (int i = length - 1; i >= 0; i -= 1) {
                ar[i] += list.head.data;
            }
            list.head = list.head.next;
            k += 1;
        }
        ar[k] = list.head.data;
        for (int i = length - 1; i > k; i -= 1) {
            ar[i] = 0;
        }
        VectorCode va = new VectorCode(ar);
        return va;
    }
}
