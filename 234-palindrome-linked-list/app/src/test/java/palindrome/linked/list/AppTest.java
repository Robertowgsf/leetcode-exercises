package palindrome.linked.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void shouldReverseLinkedList() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expectedList = new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))));

        App classUnderTest = new App();
        ListNode reversedList = classUnderTest.reverseLinkedList(list);

        assertThat(reversedList).usingRecursiveComparison().isEqualTo(expectedList);
    }
}
