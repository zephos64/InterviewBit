package Lesson1.Challenges;

public class Challenge1 {
    public static void main(String[] args) {
        LinkedListNode<Integer> head = null;
        Integer[] listValues = new Integer[] {1, 2, 3};

        head = new LinkedListNodeImpl<>(); // replace with your implementation
        head.setValuesFromArray(listValues);

        System.out.println(listValues[0] + " " + head.getValue());
        System.out.println(head.getNext().getValue());
        System.out.println(listValues[1]  + " " +  head.getNext().getValue());
        System.out.println(head.getNext().getNext().getValue());
        System.out.println(listValues[2] + " " +  head.getNext().getNext().getValue());
        System.out.println(head.getNext().getNext().getNext());
    }
}