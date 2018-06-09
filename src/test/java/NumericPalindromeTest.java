package test.java;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import main.java.NumericPalindrome;
import org.junit.Test;

public class NumericPalindromeTest {

  private static final NumericPalindrome numericPalindrome = new NumericPalindrome();

  @Test
  public void shouldCheckNonPalindromeInput(){
    //given
    long num = 123456;

    //when
    boolean result = numericPalindrome.is_numeric_palindrome(num);

    //then
    assertFalse(result);
  }

  @Test
  public void shouldCheckPalindromeInput(){
    //given
    long num = 9992999;

    //when
    boolean result = numericPalindrome.is_numeric_palindrome(num);

    //then
    assertTrue(result);
  }
}
