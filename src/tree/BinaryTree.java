package tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class BinaryTree {
	
	private IPrintStrategy printStrategy = new DfsPrintStrategy();
	private Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}

	public BinaryTree(Node root, IPrintStrategy printStrategy) {
		this.root = root;
		this.printStrategy = printStrategy;
	}

	public Node getRoot() {
		return root;
	}

	public void setPrintStrategy(IPrintStrategy printStrategy) {
		this.printStrategy = printStrategy;
	}

	public void print() {
		this.printStrategy.print(root);
	}

	public static BinaryTree createFromString(String treeDefinition) {
		String[] values = treeDefinition.split("\\s");
		Node root = null;
		Queue<Node> queue = new ArrayDeque<Node>();

		for (String string : values) {
			try {
				int value = Integer.parseInt(string);
				if (root == null) {
					root = new Node(value);
					queue.add(root);
				} else if (!queue.peek().hasLeft()) {
					Node node = new Node(value);
					queue.peek().setLeft(node);
					queue.add(node);
				} else if (!queue.peek().hasRight()) {
					Node node = new Node(value);
					queue.peek().setRight(node);
					queue.add(node);
					queue.remove();
				}
			} catch (NumberFormatException ex) {
				System.err.println("Following value is not Integer: " + string);
				System.exit(2);
			}
		}
		return new BinaryTree(root);
	}
}
