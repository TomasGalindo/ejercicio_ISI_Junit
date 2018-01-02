package urjc.isi.ejercicio1Junit;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Union {
	
	public static Vector union (Vector a, Vector b){
		/**
		* @return New object (different from a and b) of class Vector that
		* contains the union set (NO elements can be repeated) of a and b
		* @param a Vector containing elements, including null. It is not a set,
		* so it can have repeated elements, and they can be of different
		* classes / types
		* @param b Vector containing elements, including null. It is not a set,
		* so it can have repeated elements, and they can be of different
		* classes / types
		* @throws NullPointerException If a or b is null
		*/
		
		Vector v_resultado = new Vector();
		
		if(a == null || b == null ){
			 throw new NullPointerException("Alguno de los vectores esta vacio");
		}
		for (Object valor : a){
			if(!v_resultado.contains(valor)){
				v_resultado.add(valor);
			}
		}
		for (Object valor : b){
			if(!v_resultado.contains(valor)){
				v_resultado.add(valor);
			}
		}
		return v_resultado;
		
	}
	
	public static Set unionSet(Set a, Set b){
		/**
		* @return New Set (different from a and b) that contains the
		* union set of a and b
		* @param a Set of elements. It can contain the null element. It can’t
		* contain repeated elements
		* @param b Set of elements. It can contain the null element. It can’t
		* contain repeated elements
		* @throws NullPointerException If a or b is null
		*/
		
		Set s_resultado = new HashSet<>();
		
		
		if(a == null || b == null ){
			 throw new NullPointerException("Alguno de los vectores esta vacio");
		}
		for (Object valor : a){
			s_resultado.add(valor);
		}
		for (Object valor : b){
			s_resultado.add(valor);
		}
		return s_resultado;
	}
	
	
	public static <E> Set<E> unionSetGeneric (Set<? extends E> a, Set<? extends E> b){
		
		/**
		* @return New Set (different from a and b) that contains the
		* union set of a and b
		* @param a Set of elements. It can contain the null element. It can’t
		* contain repeated elements. The heterogeneity is limited.
		* @param b Set of elements. It can contain the null element. It can’t
		* contain repeated elements. The heterogeneity is limited.
		* @throws NullPointerException If a or b is null
		*/
		
		//En este caso al crear el Set tendremos que indicar de que tipo, por lo tanto
		//no se podran mezclar elementos de diferente tipo
		
		Set<E> s_resultado = new HashSet<E>();
		
		if(a == null || b == null ){
			 throw new NullPointerException("Alguno de los vectores esta vacio");
		}
		for (Object valor : a){
			s_resultado.add((E) valor);
		}
		for (Object valor : b){
			s_resultado.add((E) valor);
		}
		return s_resultado;
	}
	
}
