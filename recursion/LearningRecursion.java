package recursion;

public class LearningRecursion {
  public static void main(String[] args) {
    int n = 5;
    System.out.println(iterate(n));
  }

  static int iterate(int n) {
    if (n == 1) {
      return 1;
    }
    System.out.println(iterate(n - 1));
    return n;
  }
}



// Directly defining a "function inside a function" (nested functions) is not supported in Java in the same way it is in some other languages like JavaScript or Python. In Java, all methods (which are Java's equivalent of functions) must belong to a class.
    // public class OuterClass {
    //     public void outerMethod() {
    //         // Local class defined inside outerMethod
    //         class LocalClass {
    //             public void innerMethod() {
    //                 System.out.println("This is a method inside a local class.");
    //             }
    //         }

    //         // Create an instance of the local class and call its method
    //         LocalClass localObj = new LocalClass();
    //         localObj.innerMethod();
    //     }

    //     public static void main(String[] args) {
    //         OuterClass obj = new OuterClass();
    //         obj.outerMethod();
    //     }
    // }