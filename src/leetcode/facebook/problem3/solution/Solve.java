/**
 * 
 */
package leetcode.facebook.problem3.solution;

/**
 * @author Gopal
 *
 */
public class Solve {

	private Solve() {
		// NOOP
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return head;
		}

		int count = n;
		ListNode forwardPointer = head;
		while (count > 0) {
			forwardPointer = forwardPointer.next;
			count--;
		}

		ListNode backwardPointer = head;
		ListNode prevToBackwardPointer = null;
		while (forwardPointer != null) {
			forwardPointer = forwardPointer.next;
			prevToBackwardPointer = backwardPointer;
			backwardPointer = backwardPointer.next;
		}

		if (backwardPointer == head)
			return head.next;

		if (prevToBackwardPointer == null)
			return null;

		prevToBackwardPointer.next = backwardPointer.next;
		return head;
	}

}
