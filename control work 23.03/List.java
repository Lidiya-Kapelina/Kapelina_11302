class List {
   Element head;
   Element tail;

  void add(int data) {   //#0
   Element a = new Element();
    a.data = data;
    if (this.tail == null) {
      this.head = a;
      this.tail = a;
    } else {
      this.tail.next = a;
      this.tail = a;
    }
  }
}
