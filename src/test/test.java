package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "";
		str = s.nextLine();
		System.out.println(maxString(str));
	}

	@Test
	public void testNoChar() {
		String str = "";
		System.out.println(maxString(str));
	}
	@Test
	public void testOneChar() {
		String str = "a";
		System.out.println(maxString(str));
	}
	@Test
	public void testLangChar() {
		String str = "absdfghjklwerty121123123";
		System.out.println(maxString(str));
	}
	@Test
	public void testFourChar() {
		String str = "123123";
		System.out.println(maxString(str));
	}
	@Test
	public void testBigLangChar() {
		String str = "qwertyuiopasdfghjkzxcvbnm,./1234567890[]AQWERTYUIOASDFGHJKLZXCVBNM<>q";
		System.out.println(maxString(str));
	}
	public static int maxString(String str) {
		int maxLength = 0;
		if (str.length() == 0)
			return 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.get(ch) != null)
				return maxLength;
			else {
				map.put(ch, 1);
				maxLength++;
			}
		}
		return maxLength;
	}
}
