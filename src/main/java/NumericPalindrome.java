/**

 A palindrome is а word or a phrase or a number, that when reversed, stays the same.

 For example, the following sequences are palindromes : "azobi4amma4iboza" or "anna".

 But this time, we are not interested in words but numbers. A "number palindrome" is a number, that
 taken backwards, remains the same.

 For example, the numbers 1, 4224, 9999, 1221 are number palindromes.

 Implement a function, which given an integer computes if it's a palindrome.

 ==================================================================================================

 Solution:
 A 'long' number is received as input parameter. Using mod and division operations the number is
 splitted into single digits and added to a list.
 e.g: if a number 123456 is received as parameter, then on splitting the number the list will
 contain
 6->5->4->3->2->1
 Once list is created we loop over the list converting it into a number. In this example it will be
 654321

 then it is compared weather the original number equates the new number. If it does then it is a
 palindrome.

 */

package main.java;

import java.util.ArrayList;
import java.util.List;

public class NumericPalindrome {

  public boolean is_numeric_palindrome(long number) {
    List<Long> list = new ArrayList<>();

    long remainder = number;

    while (remainder > 0){
      long modulo = remainder % 10;
      remainder /= 10;
      list.add(modulo);
    }

    int multiplier = 1;
    long palindrome = 0;
    for (int i=list.size()-1; i>=0; i--){
      long num = list.get(i) * multiplier;
      palindrome += num;
      multiplier *= 10;
    }

    return palindrome == number ? true : false;
  }

}
