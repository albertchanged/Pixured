public class QuestionE {
    private static IntList head;

    public static int listLength(IntList head) {
        int count = 0;
//        Don't need to check these below, but good to note
//
//        if (head == null) {
//            return 0;
//        }
//        if (head.next == null) {
//            return 1;
//        }
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        QuestionE list = new QuestionE();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        System.out.println(list.toString());
        System.out.println(listLength(head));
    }

    public void add(int data) {
//        If list is empty, create new element
        if (head == null) {
            head = new IntList(data);
            return;
        }

        IntList tail = head;
//        Add new element to back of list
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new IntList(data);
    }

    private static class IntList {
        private IntList next;
        private int data;

        public IntList(int data) {
            this.data = data;
        }
    }

    /*
     * A pointer is called a linked list if:

     it is an empty pointer (it is then called a terminator or an empty list); or
     it points to a structure (called a node or the head) that contains a value and a linked list (called the tail).
     The length of a list is defined as the total number of nodes it contains. In particular, an empty list has length 0.

     For example, consider the following linked list:

     A -> B -> C -> D ->
     This list contains four nodes: A, B, C and D. Node D is the last node and its tail is the terminator. The length of this list is 4.

     Assume that the following declarations are given:

     class IntList {
     public int value;
     public IntList next;
     }

     Write a function:

     class Solution { public int solution(IntList L); }

     that, given a non-empty linked list L consisting of N nodes, returns its length.

     For example, given list L shown in the example above, the function should return 4.

     Assume that:

     N is an integer within the range [1..5,000];
     list L does not have a cycle (each non-empty pointer points to a different structure).
     In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
     */
}