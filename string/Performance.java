public class Performance {
  public static void main(String[] args) {
    // String series = ""; // worst in these cases;        // it is immutable
    StringBuilder series = new StringBuilder("");      // it is mutable
    for (int i = 0; i < 26; i++) {
      char ch = (char)('a' + i);
      // System.out.println(ch);
      // series = series + ch;  // it's giving an error
      series.append(ch);
    }
    System.out.println(series);
  }
}