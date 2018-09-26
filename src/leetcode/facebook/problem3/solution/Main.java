/**
 * 
 */
package leetcode.facebook.problem3.solution;

/**
 * @author Gopal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode newHeadNode = null;
		ListNode head = null;
		head = ListCreator.getPopulatedLinkedList(new Integer[] { 1, 2, 3, 4, 5 });
		ListPrinter.printLinkedList(head);
		newHeadNode = Solve.removeNthFromEnd(head, 2);
		ListPrinter.printLinkedList(newHeadNode);

		head = ListCreator.getPopulatedLinkedList(new Integer[] { 1, 2, 3, 4, 5 });
		ListPrinter.printLinkedList(head);
		newHeadNode = Solve.removeNthFromEnd(head, 5);
		ListPrinter.printLinkedList(newHeadNode);

		head = ListCreator.getPopulatedLinkedList(new Integer[] { 1 });
		ListPrinter.printLinkedList(head);
		newHeadNode = Solve.removeNthFromEnd(head, 1);
		ListPrinter.printLinkedList(newHeadNode);

		head = ListCreator.getPopulatedLinkedList(new Integer[] { 1, 2 });
		ListPrinter.printLinkedList(head);
		newHeadNode = Solve.removeNthFromEnd(head, 1);
		ListPrinter.printLinkedList(newHeadNode);

		head = ListCreator.getPopulatedLinkedList(new Integer[] { 1, 2 });
		ListPrinter.printLinkedList(head);
		newHeadNode = Solve.removeNthFromEnd(head, 2);
		ListPrinter.printLinkedList(newHeadNode);
	}

}
