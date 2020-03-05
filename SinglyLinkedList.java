class SinglyLinkedList<Item> {


    public int size;
    public Node<Item> head;

    // -----------------------------------------------------------------------------------
    /**
     * ----------------- Helper methods -------------------------------------
     */
    /**
     * Linked list node helper data type
     *
     * @param <Item>
     */
    public static class Node<Item> {

        Node<Item> next = null;
        Item el = null;


        public Node(Item el, Node next) {

            this.next = next;
            this.el = el;


        }
    }

    public int size() {
        return size;
    }

    // -----------------------------------------------------------------------------------
    /**
     * ----------------- ToDo: methods for you to implement
     * ---------------------------
     *
     */
    // -----------------------------------------------------------------------------------
    /**
     * Constructor of an empty Singly linked list
     *
     */
    public void display() {
        //Node current will point to head
        Node<Item> current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.el + " ");
            current = current.next;
        }
        System.out.println();
    }

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }



    public void addFirst(Item item){

        head = new Node<Item>(item, head);

    }

    public Item get(int index) {

        Node<Item> tmp = head;

        for (int i = 0; i == index -1; i++){

            tmp = tmp.next;

        }
        return tmp.el;
    }



    /**
     * Method to insert element newElement at specified index in the list
     *
     * @param index where you want to insert new element
     * @param newElement the object of type Item you want to insert
     */
    public void insertAt(int index, Item newElement) {

        if (head == null) {
            addFirst(newElement);
        } else {

            Node<Item> tmp = head;

            for (int i = 0; i == index; i++) {

                tmp = tmp.next;

            }
           tmp.next = new Node<Item>(newElement, null);
        }
    }

    /**
     * Method to remove the element at the specified index from the list
     *
     * @param index the position to remove the item from
     */
    public void removeAt(int index) {
        // ToDo: if (...) throw new IllegalArgumentException("Index ouf of bounds");
        throw new UnsupportedOperationException();
    }

    /**
     * Reverse the list
     *
     */
    public void reverse() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> testList = new SinglyLinkedList<>();
        testList.addFirst(1);
        testList.addFirst(2);
        testList.addFirst(3);
        testList.addFirst(4);
        testList.insertAt(4, 10);
        System.out.println(testList.get(1));
        testList.display();

    }
}
