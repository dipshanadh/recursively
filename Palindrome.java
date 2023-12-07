class Palindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome("kayak"));
    System.out.println(isPalindrome("hello"));
  }   

  public static boolean isPalindrome(String input) {
    // Stopping condition
    if (input.length() == 0 || input.length() == 1) {
      return true;
    }

    // Shrink the problem
    if (input.charAt(0) == input.charAt(input.length() - 1)) {
      return isPalindrome(input.substring(1, input.length() - 1));
    }

    // Handle non-palindromes
    return false;
  }
}
