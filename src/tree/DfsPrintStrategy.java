package tree;

/**
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class DfsPrintStrategy implements IPrintStrategy {

	@Override
	public void print(Node node) {
		if (node != null) {
			System.out.print(String.valueOf(node.getValue()) + ' ');
			print(node.getLeft());
			print(node.getRight());
		}
	}
}
