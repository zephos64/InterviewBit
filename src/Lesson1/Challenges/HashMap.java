package Lesson1.Challenges;
// https://courses.codepath.com/courses/interview_training/unit/1#!interviews
public class HashMap {
    public static void main (String[] args) {
        CodePathHashMap<Integer, Integer> hash =
                new CodePathHashMap<Integer, Integer>();
        hash.put(3, 4);
    }
}

class CodePathHashMap<E, K> {
    public void testMeth() {
        System.out.println("Hello codepath");
    }

    class CodePathLinkedList<E,K> {
        K val;
        E key;
        CodePathLinkedList next;

        public CodePathLinkedList(E key, K val) {
            this.val = val;
            this.key = key;
            next = null;
        }
    }

    // size will amount of object in the hashmap
    int size;
    int capacity;
    CodePathLinkedList<E,K>[] hashMap;

    public CodePathHashMap() {
        size = 0;
        capacity = 16;
        hashMap = new CodePathLinkedList<E,K>[capacity];

        for(int i = 0; i < hashMap.length; i++) {
            hashMap[i] = new CodePathLinkedList<E,K>();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    private int getHashKey(E key) {
        int hashCodeKey = key.hashCode();
        hashCodeKey = hashCodeKey & (capacity-1);
        return hashCodeKey;
    }

    public void put(E key, K value) {
        if(key == null) {
            return;
        }
        int hashCodeKey = getHashKey(key);
        CodePathLinkedList<E,K> head = hashMap[hashCodeKey];

        if(head == null) {
            head = new CodePathLinkedList<E,K>(key, value);
            size++;
        } else {
            // already data with the same hashmap
            CodePathLinkedList<E,K> temp = new CodePathLinkedList(key, value);
            temp.next = head;
            hashMap[hashCodeKey] = temp;
            size++;
        }

        //resizing if met the load factor
        if((size*1.0) >= (capacity*.75)) {
            CodePathLinkedList<E,K>[] temp = hashMap;
            capacity *= 2;
            size = 0;

            hashMap = new CodePathLinkedList<E,K>[capacity];
            for(int i = 0; i < hashMap.length; i++) {
                hashMap[i] = new CodePathLinkedList<E,K>();
            }

            for(int i = 0; i < temp.length; i++) {
                CodePathLinkedList<E,K> headIter = temp[i];
                while(headIter != null) {
                    put(headIter.key, headIter.val);
                    headIter = headIter.next;
                }
            }
        }
    }
}