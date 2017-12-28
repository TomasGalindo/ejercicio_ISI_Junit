package urjc.isi.ejercicio1Junit;

import java.util.Vector;

public class Union {
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
	public static Vector union (Vector a, Vector b){
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
}
