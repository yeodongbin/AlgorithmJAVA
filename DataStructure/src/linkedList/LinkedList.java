package linkedList;

public class LinkedList {

	Node head;

	public static void main(String[] arg) {

		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		head.setNextNode(second);
		second.setNextNode(third);
		
		nodePrint(head);

		return;
	}

	static void nodePrint(Node firstNode) {
		if (firstNode != null) {
			Node tempNode = firstNode;

			while (tempNode != null) {
				System.out.print(tempNode.getData() + " -> ");
				tempNode = tempNode.getNextNode();
				if (tempNode == null) {
					System.out.println("null");
				}
			}
		} else {
			System.out.println("input parameter is null");
		}

	}
}
