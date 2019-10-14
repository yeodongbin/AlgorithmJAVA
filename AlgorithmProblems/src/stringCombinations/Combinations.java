//Àç±ÍÀû ¹æ¹ı

package stringCombinations;

import stringPermutation.Permutations;

public class Combinations {
	StringBuilder out = new StringBuilder();
	String in;

	Combinations(final String str) {
		in = str;
	}

	void combine() {
		combine(0);
	}

	void combine(int start) {
		for (int i = start; i < in.length(); ++i) {
			out.append(in.charAt(i));
			System.out.println(out);
			if (i < in.length()) {
				combine(i + 1);
			}
			out.setLength(out.length() - 1);
		}
	}

	public static void main(String[] args) {
		Combinations c = new Combinations("abcd");
		c.combine();
	}
}
