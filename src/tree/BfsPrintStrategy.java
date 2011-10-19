package tree;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * @author Jan Machala <jan.machala@email.cz>
 */
public class BfsPrintStrategy implements IPrintStrategy {

	Queue<Node> queue = new ArrayDeque<Node>();

	@Override
	public void print(Node node) {
		queue.add(node);
		printQueue();
	}

	private void printQueue() {
		if (!queue.isEmpty()) {
			Node node = queue.poll();
			if (node.getLeft() != null) queue.add(node.getLeft());
			if (node.getRight() != null) queue.add(node.getRight());
			System.out.print(String.valueOf(node.getValue()) + ' ');
			printQueue();
		}
	}
}
