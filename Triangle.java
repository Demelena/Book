public class Triangle
//This computation tests whether the three numbers could be the lengths of the sides of some triangle
{
    public static void main(String[] args)
    {
    int sidea = Integer.parseInt(args[0]);
    int sideb = Integer.parseInt(args[1]);
    int sidec = Integer.parseInt(args[2]);
    boolean isTriangle;

    isTriangle = (sidea + sideb >= sidec) || (sideb + sidec >= sidea) || (sidea + sidec >= sideb);
    isTriangle = !isTriangle;
    System.out.println(isTriangle);
    }
}