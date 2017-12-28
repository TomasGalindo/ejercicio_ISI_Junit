package urjc.isi.ejercicio1Junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urjc.isi.ejemplosClase.Min;

public class UnionTest {

	private Vector a;   // Test fixture
	private Vector b;   // Test fixture
	private Vector c;
	
	@Before      // Set up - Called before every test method.
	public void setUp()
	{
		a = new Vector();
		b = new Vector();
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
	    b.add("perro");
	    Union.union(a, b);
	}
	
	@Test (expected = NullPointerException.class)
	public void testForBothNullVector()
	{
		b = null;
		a = null;
	    Union.union(a, b);
	}
	
	@Test
	public void testDifferentVectors()
	{
		c = new Vector();
		a.add(1);
		a.add(2);
		a.add(3);
		b.add("perro");
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add("perro");
		
		assertTrue("Mismos elementos", c.equals(Union.union(a, b)));
		
	}
	
}
