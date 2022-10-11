package Generics;

public class GenericsString {
	/*
	 * @param x taking first Value
	 * @param y taking Second Value
	 * @param z taking Third Value
	 * @return returning the result which is maximum
	 */

	public String maximum(String x, String y, String z) {
		
		String max = x;
		
		if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
			max = y;
		else if (z.compareTo(max) > 0)
			max = z;
		
		return max;
	}
}
