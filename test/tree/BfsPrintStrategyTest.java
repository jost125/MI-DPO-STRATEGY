/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jan Machala <jan.machala@email.cz>
 */
public class BfsPrintStrategyTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


	public BfsPrintStrategyTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of print method, of class DfsPrintStrategy.
	 */
	@Test
	public void testPrint() {
		BinaryTree tree = BinaryTree.createFromString("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20");
		tree.setPrintStrategy(new BfsPrintStrategy());
		tree.print();
		assertEquals("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ", outContent.toString());
	}
}
