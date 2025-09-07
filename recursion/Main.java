package recursion;

public class Main {
  public static void main(String[] args) {
    System.out.println(printNums(5));
  }

  static int printNums(int n) {
    int res = 1;
    if (n == 0) {
      return 0;
    }
    System.out.println(n);
    return printNums(n - 1);
  }
}
