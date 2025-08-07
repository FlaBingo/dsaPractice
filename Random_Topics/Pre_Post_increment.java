package Random_Topics;
public class Pre_Post_increment {
  public static void main(String[] args) {
    int n = 5;
    int result = 0;
    for (int i = 1; i <= n; ++i) {
      result += i;
      System.out.println(result);
    }
    System.out.println(result);
  }
}
// In the context of a for loop's update expression (for (initialization; condition; update)), the update part is evaluated after the loop body completes. Since the update expression i++ or ++i is not part of a larger expression that needs a return value, both simply increment i by 1.

// Let's look at a quick example outside of a for loop to see the difference more clearly:

// int a = 5;
// int b = ++a; // 'a' becomes 6, 'b' is assigned 6
// System.out.println("a: " + a + ", b: " + b); // Output: a: 6, b: 6

// int x = 5;
// int y = x++; // 'y' is assigned 5, then 'x' becomes 6
// System.out.println("x: " + x + ", y: " + y); // Output: x: 6, y: 5