package E2ETestCase;

import java.util.ArrayList;

public class Amazon_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ac[] = { 4, 5, 5, 5, 4, 6, 9, 4 };

		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < ac.length; i++) {
			int k = 0;
			if (!ar.contains(ac[i])) {
				ar.add(ac[i]);
				k++;
				for (int j = i + 1; j < ac.length; j++) {
					if (ac[i] == ac[j]) {
						k++;
					}
				}
				// System.out.println(a[i]);
				// System.out.println(k);
				if (k == 1)
					System.out.println(ac[i] + " is the unique number");
			}

		}
	}

}
