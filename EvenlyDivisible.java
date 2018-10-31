public class EvenlyDivisible
//This computation tests if either of two positive integers (command-line arguments) evenly divides the other and prints true if so.
{
public static void main(String[] args)
    {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    boolean isEvenlyDivisible;

    isEvenlyDivisible = (a%b == 0) || (b%a == 0);
    System.out.println(isEvenlyDivisible);
    }
}