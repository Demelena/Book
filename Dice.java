public class Dice
// This program prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).

{
public static void main(String[] args) 
{
    int max = 6;
    int min = 1;
 double r = Math.round( (Math.random() * ((max - min) + 1)) + min); 
 double q = Math.round( (Math.random() * ((max - min) + 1)) + min);
 int value = (int) (r + q); // sum of two random integers between 1 and 6 (such as you might get when rolling dice)
 System.out.println(r + " + " + q + " = " + value);
}
}