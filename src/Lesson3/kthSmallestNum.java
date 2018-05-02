public class kthSmallestNum {
    public int kthsmallest(final List<Integer> A, int B) {
        PriorityQueue<Integer> kQueue = new PriorityQueue<Integer>(B, Collections.reverseOrder());
        for(int i = 0; i < A.size(); i++) {
            if(kQueue.size() < B) {
                kQueue.add(A.get(i));
            } else {
                // Assume have all ints in queue
                if(kQueue.peek() > A.get(i)) {
                    kQueue.poll();
                    kQueue.add(A.get(i));
                }
            }
        }

        return kQueue.poll();
    }
}