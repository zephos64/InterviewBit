public class nextgreater {
    static class numPos {
        int pos;
        int val;
        numPos(int pos, int val) {
            this.pos = pos;
            this.val = val;
        }
    }
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        // Number, position
        Stack<numPos> greaterStack = new Stack<numPos>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        greaterStack.push(new numPos(0, A.get(0)));
        // to allow putting values at any position in result array
        for(int a = 0; a < A.size(); a++) {
            result.add(-1);
        }

        for(int i = 1; i < A.size(); i++) {
            int next = A.get(i);
            if(!greaterStack.empty()) {
                numPos temp = greaterStack.pop();
                int element = temp.val, pos = temp.pos;
                while (element < next) {
                    // remove the -1, insert the correct value
                    result.set(pos, next);
                    if(greaterStack.isEmpty()) {
                        break;
                    }
                    temp = greaterStack.pop();
                    element = temp.val;
                    pos = temp.pos;
                }
                if(element >= next) {
                    greaterStack.push(new numPos(pos, element));
                }
            }
            greaterStack.push(new numPos(i, next));
        }
        while(!greaterStack.empty()) {
            numPos temp = greaterStack.pop();
        }
        return result;
    }
}