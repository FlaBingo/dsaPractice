package Random_Topics;

public class LSPLength {
  public static void main(String[] args) {
    String s = "aaaa";
    System.out.println(getLSPLength(s));
  }

  static int getLSPLength(String s){
    String ans = "";
    for (int i = 0; i < s.length() - 1; i++) {
      String a = s.substring(0, i + 1);
      String b = s.substring(s.length() - 1 - i, s.length());
      if (a.equals(b)) {
        ans = b;
      }
    }
    return ans.length();
  }
}
