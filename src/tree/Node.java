package tree;

/**
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class Node {
	private Node left;
	private Node right;
	private int value;

	public Node(int value) {
		this.value = value;
	}

	public Node setLeft(Node left) {
		this.left = left;
		return this.left;
	}

	public Node setRight(Node right) {
		this.right = right;
		return this.right;
	}

	public Node getLeft() {
		return left;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public Node getRight() {
		return right;
	}

	public int getValue() {
		return value;
	}

	public boolean hasRight() {
		return right != null;
	}
}
