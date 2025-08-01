public class Palindrome {
  public static void main(String[] args) {
    String str = "abccba";
    // System.out.println(isPalindromeBySB(str));
    // System.out.println(isPalindromeByWhileLoop(str));
    // System.out.println(isPalindromeByForLoop(str));


    // all of them are working perfectly well;
  }


  static boolean isPalindromeByForLoop(String str){
    if (str == null || str.length() == 0 || str.length() == 1) {
      return true;
    }
    for (int i = 0; i < str.length() / 2; i++) {
      char start = str.charAt(i);
      char end = str.charAt(str.length() - i - 1);

      if (start != end) {
        return false;
      }
    }
    return true;
  }

  static boolean isPalindromeByWhileLoop(String str) {
    if (str == null || str.length() == 0 || str.length() == 1) {
      return true;
    }
    str = str.toLowerCase();
    int start = 0;
    int end = str.length() - 1;
    while (start <= end) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  static boolean isPalindromeBySB(String str) {
    if (str.length() == 0 || str.length() == 1) {
      return true;
    }
    StringBuilder strBuild = new StringBuilder(str);
    String strRev = new String(strBuild.reverse());
    if (str.equals(strRev)) {
      return true;
    }
    return false;
  }
}
