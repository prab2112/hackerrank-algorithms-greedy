package test;

import java.util.HashSet;

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		HashSet<ListNode> set = new HashSet<>();
		while (headA != null) {
			set.add(headA);
			headA = headA.next;
		}
		while (!set.contains(headB) && headB != null)
			headB = headB.next;

		if (headB != null)
			return headB;

		return null;

	}
}