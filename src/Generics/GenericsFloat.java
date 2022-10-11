package Generics;

public class GenericsFloat {
	
	/*
	 * @param x taking first Value
	 * @param y taking Second Value
	 * @param z taking Third Value
	 * @return returning the result which is maximum
	 */

	public Float maximum(Float x, Float y, Float z) {
		
		Float max = x;
		
		if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
			max = y;
		else if (z.compareTo(max) > 0)
			max = z;
		
		return max;
	}
}
