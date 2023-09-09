public class hw2 {
    public static void main(String[] args) {
        Answer.ListNode node1 = new Answer.ListNode(1);
        Answer.ListNode node2 = new Answer.ListNode(2);
        Answer.ListNode node3 = new Answer.ListNode(3);

        node1.next = node2;
        node2.next = node3;

        printList(node1);
        Answer.ListNode reverseNode = Answer.reverse(node1);
        printList(reverseNode);
    }

    public static void printList(Answer.ListNode head){
        Answer.ListNode current = head;
        while (current!=null){
            System.out.print(current.value+" ");
            current=current.next;
        }
        System.out.println();
    }


}
