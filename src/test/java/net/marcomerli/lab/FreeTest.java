package net.marcomerli.lab;

import org.junit.Test;

import de.danielbechler.diff.ObjectDifferBuilder;
import de.danielbechler.diff.node.DiffNode;
import junit.framework.TestCase;
import net.marcomerli.lab.mock.DummyMock;

public class FreeTest
	extends TestCase {

	@Test
	public void test() throws Exception
	{}

	public static void main(String[] args) throws Exception
	{
		String k = "0";
		DummyMock a = new DummyMock(Long.valueOf(k), Double.valueOf(k),
			Integer.valueOf(k), k, Boolean.valueOf(k), null, null);

		k = "1";
		DummyMock b = new DummyMock(Long.valueOf(k), Double.valueOf(k),
			Integer.valueOf(k), k, Boolean.valueOf(k), null, null);

		System.out.printf("equals: %s\n", a.equals(b));
		DiffNode diff = ObjectDifferBuilder.buildDefault().compare(a, b);
		System.out.printf("compare: %s\n", diff);
	}
}
