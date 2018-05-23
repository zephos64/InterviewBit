package Lesson1.Challenges;

public class LinkedListNodeImpl<E> implements LinkedListNode<E> {
    E value;
    LinkedListNode<E> next;

    LinkedListNodeImpl() {
        value = null;
        next = null;
    }

    LinkedListNodeImpl(E value) {
        this.value = value;
        next = null;
    }

    @Override
    public E getValue() {
        return value;
    }

    @Override
    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public LinkedListNode<E> getNext() {
        return next;
    }

    @Override
    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }

    @Override
    public void setValuesFromArray(E[] listValues) {
        this.setValue(listValues[0]);
        LinkedListNode<E> current = this;
        for (int a = 1; a < listValues.length; a++) {
            LinkedListNode<E> node = new LinkedListNodeImpl<E>(listValues[a]);
            current.setNext(node);
            current = node;
        }
    }

    @Override
    public void printNode() {
        System.out.print(this.getValue() + " ");
        LinkedListNode next = this.getNext();
        while (next != null) {
            System.out.print(next.getValue() + " ");
            next = next.getNext();
        }
        System.out.print("\n");
    }
}
