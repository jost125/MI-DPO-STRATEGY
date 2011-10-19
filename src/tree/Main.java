package tree;

/**
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class Main {

	public static void main(String[] args) {
		if (args.length == 1 && (args[0].equals("dfs") || args[0].equals("bfs"))) {
			BinaryTree tree = BinaryTree.createFromString("21 45 87 12 65 47 98 15 12 3 6 48 2 54 3 987 132 6 123 45 98 56 1465 32 8 6 2 4 687 13 98 12 32 6 98 4 12 654 78 2132 985 5 15 589 21 248 8 41 2");
			if (args[0].equals("dfs")) {
				tree.setPrintStrategy(new DfsPrintStrategy());
			} else {
				tree.setPrintStrategy(new BfsPrintStrategy());
			}
			tree.print();
			System.out.println("");
		} else {
			System.err.println("Parametr dfs or bfs expected.");
			System.exit(1);
		}
	}
}
