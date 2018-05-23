package Lesson1.Challenges;

import java.util.LinkedList;

public class Challenge2 {
    public static void main(String[] args) {
        LinkedListNode<Integer> list1 = new LinkedListNodeImpl<Integer>();
        LinkedListNode<Integer> list2 = new LinkedListNodeImpl<Integer>();

        Integer[] listValues1 = new Integer[]{1, 2, 3};
        Integer[] listValues2 = new Integer[]{7, 8, 9};
        list1.setValuesFromArray(listValues1);
        list2.setValuesFromArray(listValues2);

        LinkedListNode<Integer> sum = addList(list1, list2);
        sum.printNode();
    }

    public static LinkedListNode addList(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
        int carry = 0;
        LinkedListNode result = null, runner = null;
        while (list1 != null || list2 != null || carry > 0) {
            int sum = 0;
            // Get the sum of list1.val, list2.val, and current carry
            if (list1 != null) {
                sum += list1.getValue();
                list1 = list1.getNext();
            }
            if (list2 != null) {
                sum += list2.getValue();
                list2 = list2.getNext();
            }
            sum += carry;

            // Do any re-calculations if >10
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;

            // Create next node
            LinkedListNode<Integer> node = new LinkedListNodeImpl<Integer>(sum);
            if(result == null) {
                result = node;
                runner = result;
            } else {
                runner.setNext(node);
                runner = node;
            }
        }
        return result;
    }
}