package urjc.isi.ejercicio1Junit;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnionSetGenericTest {
	//Tenemos que indicar que que tipo va a ser nuestra collecion
	private Set<Integer> a;   
	private Set<Integer> b;   
	private Set<Integer> c;
	
	@Before      // Set up - Called before every test method.
	public void setUp()
	{
		a = new HashSet<>();
		b = new HashSet<>();
	}

	@After      // Tear down - Called after every test method.
	public void tearDown()
	{
	   a = null;
	   b = null;
	}
	
	@Test (expected = NullPointerException.class)
	public void testForNullVector()
	{
		a = null;
	    b.add(1);
	    Union.unionSet(a, b);
	}

	@Test (expected = NullPointerException.class)
	public void testForBothNullVector()
	{
		b = null;
		a = null;
	    Union.unionSet(a, b);
	}
	
	@Test
	public void testDifferentVectors()
	{
		c = new HashSet<>();;
		a.add(1);
		a.add(2);
		a.add(3);
		b.add(5);
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(5);
		
		assertTrue("Mismos elementos", c.equals(Union.unionSet(a, b)));
		
	}
	
	@Test
	public void testNotCopyRepeatElement()
	{
		c = new HashSet<>();;
		a.add(1);
		a.add(25);
		a.add(2);
		a.add(2);
		a.add(3);
		
		b.add(25);
		b.add(25);
		b.add(1);
		b.add(1);
		
		c.add(1);
		c.add(25);
		c.add(2);
		c.add(3);
		c.add(25);
		assertTrue("Mismos elementos", c.equals(Union.unionSet(a, b)));
	}
}
