/*
 * permutation
 * hat => tha, aht, tah, ath, hta, hat
 */


package stringPermutation;

public class Permutations {

	boolean[] used;
	StringBuilder out = new  StringBuilder();
	String in;

	public Permutations(final String str) {
		in = str;
		used = new boolean [in.length()];
	}

	public void permute(){
		if (out.length() == in.length()) {
			System.out.println(out);
			return;
		}

		for (int i =0; i<in.length();++i) {
			if (used[i]) {
				continue;
			}
			out.append(in.charAt(i));
			used[i] = true;
			permute();
			used[i] = false;
			out.setLength(out.length()-1);
		}
	}

	public static void main(String[] args) {
		Permutations p = new Permutations("abcd");
		p.permute();

	}
}
