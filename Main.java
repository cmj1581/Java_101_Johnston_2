
// Teaching and Inspiration from: Dr. T
import java.util.Scanner; // like #include <xxyyzz>. util.Scanner accepts input from user

class Main {
  public static void main(String[] args) {
    // data types and variables in Java

    int myNum = 5;
    float fNum = 2.4f; //need to put f at the end for float
    double dNum = 2.0;
    char cNum = 'C';
    boolean bNum = true; //fully spell boolean
    String sInfo = "Cameron"; //capitalize the S in String
    System.out.println("Int: " + myNum); //this is how to print, the + is like another set of << for this purpose.
    System.out.println("Float: " + fNum);
    System.out.println("Double: " + dNum);
    System.out.println("Char: " + cNum);
    System.out.println("Boolean: " + bNum);
    System.out.println("String: " + sInfo);

    // accepting input from users. Here we create a scanner object to recieve the input.
    // accept 4 numbers. 2 double, 2 int, add, subtract, multiply, divide, and modulus
    Scanner sc = new Scanner(System.in);
    double n1 = 0.0, n2 = 0.0, add = 0.0, sub = 0.0, mult = 0.0, div = 0.0;
    int n3 = 0, n4 = 0, mod = 0;

    //INPUT WITH VALIDATION
    while(true) {
      System.out.println("\nPlease enter number 1");
      try {
        n1 = Double.parseDouble(sc.next()); //take the data, parse it to make sure it's a double
        break;
      }
      catch (NumberFormatException ignore) {
        System.out.println("\nInvalid Input. Try again. ");
      }
    }

    System.out.println("\nPlease enter number 2: ");
    n2 = sc.nextDouble();

    System.out.println("\nPlease enter number 3: ");
    n3 = sc.nextInt();

    System.out.println("\nPlease enter number 4: ");
    n4 = sc.nextInt();

    //Processing
    add = n1 + n2;
    sub = n1 - n2;
    mult = n1 * n2;
    div = n1 / n2;
    mod = n3 % n4;

    //output results
    System.out.println("Here is your addition, subtraction, multiplication, division, and modulus results ");

    System.out.println(n1 + " + " + n2 + " = " + add);
    System.out.println(n1 + " - " + n2 + " = " + sub);
    System.out.println(n1 + " * " + n2 + " = " + mult);
    System.out.println(n1 + " / " + n2 + " = " + div);
    System.out.println(n3 + " % " + n4 + " = " + mod);


  }
}