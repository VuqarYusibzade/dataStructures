public class MyLinkedList<T> {
// sual 2.
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size || head == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public T remove(int index) {
        if (index < 0 || index >= size || head == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        T removedData;
        if (index == 0) {
            removedData = head.data;
            head = head.next;
        } else {
            Node<T> prev = null;
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            removedData = current.data;
            prev.next = current.next;
        }
        size--;
        return removedData;
    }

    public int find(T item) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(item)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

// sual 3.
    public MyLinkedList<T> reverse() {
        MyLinkedList<T> reversedList = new MyLinkedList<>();

        Node<T> current = head;
        while (current != null) {
            reversedList.addFirst(current.data);
            current = current.next;
        }

        return reversedList;
    }

    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

}


