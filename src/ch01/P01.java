/**
 * 
 */
package ch01;

import java.util.HashSet;
import java.lang.Character;

/**
 * @author bandith
 *
 */
public class P01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		P01 test1 = new P01();
		
		System.out.println("Ver 1");
		System.out.println(test1.allUniqueChar(""));

		System.out.println(test1.allUniqueChar("w0w"));

		System.out.println(test1.allUniqueChar("afda"));

		System.out.println(test1.allUniqueChar("abcd"));
		
		System.out.println("Ver 2");
		System.out.println(test1.allUniqueCharUsingBoolean(""));

		System.out.println(test1.allUniqueCharUsingBoolean("w0w"));

		System.out.println(test1.allUniqueCharUsingBoolean("afda"));

		System.out.println(test1.allUniqueCharUsingBoolean("abcd"));

	}
	
	/**
	 * Determine if a string has all unique characters using hash set
	 * @param word
	 * @return
	 */
	public boolean allUniqueChar(String word) 
	{
		HashSet<Character> charSet = new HashSet<Character>();
		
		for (int i = 0; i < word.length(); i++) 
		{
			if (!charSet.add(word.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Determine if a string has all unique characters using boolean
	 * @param word
	 * @return
	 */
	public boolean allUniqueCharUsingBoolean(String word) 
	{
	    boolean[] charSet = new boolean[256];
		
		for (int i = 0; i < word.length(); i++) 
		{
			if (charSet[word.charAt(i)]) {
				
				return false;
			} else {
				charSet[word.charAt(i)] = true;
			}
		}
		return true;
	}


}
