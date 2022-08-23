package palindrome.linked.list;

public class App {
    public static void main(String[] args) {
    }

    public ListNode reverseLinkedList(ListNode list) {
        ListNode reversed = null;
        ListNode current = list;

        while (current != null) {
            ListNode next = current.next;
            current.next = reversed;
            reversed = current;
            current = next;
        }

        return reversed;
    }
}
