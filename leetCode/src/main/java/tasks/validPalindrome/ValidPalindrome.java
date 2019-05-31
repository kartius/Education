package tasks.validPalindrome;

public class ValidPalindrome {

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */


    public boolean isPalindrome(String s) {
        boolean flag = false;
        int j = 0;
        String result = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if (result.length() <= 1 || result.equals(" ")) {
            return true;
        }
        char[] chars = result.toCharArray();
        j = chars.length - 1;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] == chars[j]) {
                j--;
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
