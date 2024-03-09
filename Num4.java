class Num4 {
    private ListElement head;
    private ListElement tail;

    void addSort(int data) {
        ListElement l = new ListElement();
        l.data = data;
        if (this.tail == null) {
            this.head = l;
            this.tail = l;
        } else {
            if (data <= this.head.data) {
                l.next = this.head;
                this.head = l;

            } else {
                if (data >= this.tail.data) {
                    this.tail.next = l;
                    this.tail = l;
                } else {
                    ListElement t = this.head;
                    while (t != this.tail) {
                        if ((!(t.data > data)) && (!(t.next.data < data))) {
                            ListElement t1 = t.next;
                            t.next = l;
                            t = t.next;
                            t.next = t1;
                            break;
                        } else {
                            t = t.next;
                        }
                    }
                }
            }
        }
    }

    void printList() {
        ListElement t = this.head;
        while (t != this.tail) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.print(t.data + " ");
        System.out.println();
    }
}
