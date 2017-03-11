package algorithms.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import datastructures.AllUtils;

public class TwoCharacters {
	static ArrayList<Character> visited = new ArrayList<Character>();

	public static void main(String[] args) {
		String s = "abcabcabc";

		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			if (!visited.contains(s.charAt(i))) {
				visited.add(s.charAt(i));
			}

		}

		for (int i = 0; i < visited.size(); i++) {
			for (int j = i + 1; j < visited.size(); j++) {

			}
		}

	}

	public static boolean testTString(String t) {

		System.out.println(t);
		char one = t.charAt(0);
		char two = t.charAt(1);
		if (one == two)
			return false;

		for (int i = 0; i < t.length(); i += 2) {
			if (t.charAt(i) != one || t.charAt(i + 1) != two)
				return false;
		}

		return true;
	}

	public static String replaceBadString(char one, char two) {

		return null;

	}

}
