class StringReversal {
  public static void main(String[] args) {
    System.out.println(reverseString("Hello, World!"));
  }

  public static String reverseString(String input) {
    // Base case
    if (input.equals("")) {
      return "";
    }

    // Shrink the problem
    return reverseString(input.substring(1)) + input.charAt(0);
  }
};