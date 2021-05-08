
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
    int newAge;
    String newName;
    double num5 = 0.0;

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

    Person tyson = new Person();

    System.out.println("Age: " + tyson.getAge());
    System.out.println("Name: " + tyson.getName());

    tyson.setAge(38);
    tyson.setName("Tyson");

    System.out.println("Age: " + tyson.getAge());
    System.out.println("Name: " + tyson.getName());

    Person cameron = new Person();
    cameron.setAge(24);
    cameron.setName("Cameron");
    System.out.println("Age: " + cameron.getAge());
    System.out.println("Name: " + cameron.getName());

    if (cameron.getAge() < tyson.getAge()) {
      System.out.println("Dr. T is older than me");
    }
    else if (cameron.getAge() == tyson.getAge()) {
      System.out.println("Dr. T! We're the same age!");
    }
    else {
      System.out.println("Dr. T is younger than me");
    }

    Person newGuy = new Person();
    System.out.println("Please enter an age and name for the new guy");
    newAge = sc.nextInt();
    newName = sc.next();

    newGuy.setAge(newAge);
    newGuy.setName(newName);

    if (cameron.getAge() < newGuy.getAge()) {
      System.out.println("The new guy is older than me");
    }
    else if (cameron.getAge() == newGuy.getAge()) {
      System.out.println("The new guy is the same age as me");
    }
    else {
      System.out.println("The new guy is younger than me");
    }

    System.out.println("Please enter a number for me to square for you");
    num5 = sc.nextDouble();
    System.out.println(getSquare(num5));


  }
  public static double getSquare(double num5) { return num5 * num5; }
}