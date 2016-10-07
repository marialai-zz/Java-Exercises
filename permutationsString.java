// print all permutations of a string

public static void main(String args[]) {
	perm("map");
}

static void perm(String str) {
	perm(str, "");
}

static void perm(String remainder, String prefix) {
	
	if (remainder == "") {
		System.out.println(prefix);
	} else {
		for (int i = 0; i < remainder.length(); i++) {
			String newRemainder = remainder.substring(0,i) + remainder.substring(i+1);
			perm(newRemainder, prefix + remainder.charAt(i));
		}	
	}
}