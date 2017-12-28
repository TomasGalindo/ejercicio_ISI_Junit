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
	   public void testForNullElement()
	   {
	      a = null;
	      Union.union(a, b);
	   }
}
