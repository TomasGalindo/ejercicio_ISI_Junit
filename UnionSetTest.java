package urjc.isi.ejercicio1Junit;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnionSetTest {
	
	private Set a;   
	private Set b;   
	private Set c;
	
	@Before      // Set up - Called before every test method.
	public void setUp()
	{
		a = new HashSet();
		b = new HashSet();
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
		c = new HashSet();;
		a.add(1);
		a.add(2);
		a.add(3);
		b.add("perro");
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add("perro");
		
		assertTrue("Mismos elementos", c.equals(Union.unionSet(a, b)));
		
	}
	
	@Test
	public void testNotCopyRepeatElement()
	{
		c = new HashSet();;
		a.add(1);
		a.add("gato");
		a.add(2);
		a.add(2);
		a.add(3);
		
		b.add("perro");
		b.add("gato");
		b.add(1);
		b.add(1);
		
		c.add(1);
		c.add("gato");
		c.add(2);
		c.add(3);
		c.add("perro");
		assertTrue("Mismos elementos", c.equals(Union.unionSet(a, b)));
	}

}
