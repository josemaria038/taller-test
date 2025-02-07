package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    System.out.println("First example: " + getSubstringsFrom("abcc", 2));
    System.out.println("Second example: " + getSubstringsFrom("aabab", 3));
  }

  /**
   * Count of substrings of length K with exactly K distinct characters
   * Given string str of the lowercase alphabet and an integer K, the task
   * is to count all substrings of length K which have exactly K distinct characters.
   *
   * @param str Input
   * @param k   Length
   * @return
   */
  public static int getSubstringsFrom(String str, int k) {
    int result = 0;
    String sub;
    for (int i = 0; i < str.length() - k; i++) {
      sub = str.substring(i, i + k);
      if (areCharactersDistinct(sub)) {
        result++;
      }
    }

    return result;
  }

  public static boolean areCharactersDistinct(String s) {
    List<Character> list = s.chars()
        .mapToObj(c -> (char) c)
        .toList();
    Set<Character> set = new HashSet<>(list);
    return set.size() == s.length();
  }

}