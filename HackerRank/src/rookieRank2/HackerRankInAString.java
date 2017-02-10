package rookieRank2;

import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = { 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k' };
		int h = 0;

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			// your code goes here

			h = 0;
			for (int i = 0; i < s.length(); i++) {
				
				if(h==10)
					break;
				if (s.charAt(i) == c[h]) {
					h++;
				}
				

			}

			if (h == 10) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}
}
