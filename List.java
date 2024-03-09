class List {
    private ListElement head;
    private ListElement tail;

    void addBack(int data) {   //#0
        ListElement a = new ListElement();
        a.data = data;
        if (this.tail == null) {
            this.head = a;
            this.tail = a;
        } else {
            this.tail.next = a;
            this.tail = a;
        }
    }

    int maxi() {//#1
        ListElement t = this.head;
        ListElement t2 = this.tail;
        int m = t.data;
        while (t != t2) {
            t = t.next;
            if (t.data > m) {
                m = t.data;
            }
        }
        return m;
    }

    String prov(int x) {//#2
        ListElement t = this.head;
        ListElement t2 = this.tail;
        if (t2.data == x) {
            return "элемент есть";
        }
        while (t != t2) {
            if (t.data == x) {
                return "элемент есть";
            }
            t = t.next;
        }
        return "элемента нет";
    }

    void sort(int n) {//#3
        ListElement t = this.head;
        ListElement t2 = this.tail;
        int[] mas = new int[n];
        for (int i = 0; i < n; i += 1) {
            mas[n - i - 1] = this.maxi();
            // System.out.println(mas[n - i - 1]);
            t = this.head;
            while (t.data != this.maxi()) {
                t = t.next;
            }
            t.data = -2147483648;
        }
        int k = 0;
        t = this.head;
        while (t != t2) {
            t.data = mas[k];
            k += 1;
            t = t.next;
        }
        t2.data = mas[k];
    }

    void del() {//#5

        ListElement t = this.head;
        if (t.next == null) {
            System.out.println("менее 2 элементов");
        } else {
            t = t.next;
            t = t.next;
            this.head = t;
        }
    }

    void delx(int x) {//6
        ListElement t = this.head;
        if (prov(x) == "элемент есть") {
            while (t.next.data != x) {
                t = t.next;
            }
            t.next = t.next.next;
        } else {
            System.out.println("Элемента нет");
        }
    }

    void num7(int x) {
        ListElement t = this.head;
        if (prov(x) != "элемент есть") {
            System.out.println("Элементов нет");
        } else {
            while (prov(x) == "элемент есть") {
                this.delx(x);
            }
        }
    }

    void num8(int x, int y) {
        ListElement t = this.head;
        if (prov(x) == "элемент есть") {
            while (t.data != x) {
                t = t.next;
            }
            ListElement a = new ListElement();
            a.data = y;
            if (t != this.tail) {
                a.next = t.next;
                t.next = a;
            } else {
                this.addBack(y);
            }
        } else {
            System.out.println("элемента нет");
        }
    }

    void num9(int x, int y) {
        if (prov(x) == "элемент есть") {
            ListElement t = this.head;
            ListElement a = new ListElement();
            a.data = y;
            if (t.data == x) {
                a.next = t;
                this.head = a;
            } else {
                ListElement t1 = new ListElement();

                while (t.next.data != x) {
                    t = t.next;
                }
                t1 = t.next;
                t.next = a;
                t = t.next;
                t.next = t1;
            }
        } else {
            System.out.println("элемента нет");
        }
    }

    void num10(int x, int y) {
        if (this.prov(x) != "элемент есть") {
            System.out.println("элемента нет");
        } else {
            ListElement t = this.head;
            while (t != this.tail) {
                if (t.data == x) {
                    ListElement t1 = new ListElement();
                    ListElement t2 = new ListElement();
                    t2.data = y;
                    t2.next = t.next;
                    t.next = t2;
                    t = t.next;
                } else {
                    t = t.next;
                }
            }
            if (this.tail.data == x) {
                this.addBack(y);
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
