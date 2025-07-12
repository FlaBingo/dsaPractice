


public class Comparison {
  public static void main(String[] args) {
    String a = "satyam";
    String b = "satyam";

    // == 
    System.out.println(a == b);
    //true; because both reference variables a & b are pointing to the same object

    String name1 = new String("satyam");
    String name2 = new String("satyam");

    System.out.println(name1 == name2);
    //false;

    System.out.println(name1.equals(name2));
    //true; checks only for values

    // we can't use this name1[0]
    System.out.println(name1.charAt(0));
  }
}
