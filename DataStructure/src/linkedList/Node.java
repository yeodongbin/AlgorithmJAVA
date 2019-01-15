package linkedList;

public class Node {
	private int data;
	private Node nextNode = null;
	private Node beforetNode = null;
	
	public Node getBeforetNode() {
		return beforetNode;
	}

	public void setBeforetNode(Node beforetNode) {
		this.beforetNode = beforetNode;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	Node(int data) {
		this.data = data;
	}
	
	int getData() {
		return this.data;
	}
	
	void setData(int data)	{
		this.data = data;
	}
}
