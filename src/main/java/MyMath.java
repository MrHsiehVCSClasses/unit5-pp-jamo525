package u5pp;

/**
Does basic math operations
absolute value for both integer and double
power (base to an exponent) for double to integer respectively
square root (only if perfect) for integer 
*/
public class MyMath
{
  /**
  @param x- integer
  @return absolute value of x
  */
  public static int abs(int x)
  {
    if (x < 0)
      return x - x - x;
    else
      return x;
  }
  /**
  @param x- double
  @return absolute value of x
  */
  public static double abs(double x)
  {
     double absX;
     if (x < 0)
     {
      absX = x - x - x;
      return absX;
     }
     else
      return x;
  }
  /**
  @param base & exponent- integers
  @return output, which is base to the power of the exponent
  */
  public static double pow(double base, int exponent)
  {
    double output = 1.0;
    for (int i = 1; i <= exponent; i++)
    {
      output = output * base;
    }
    return output;
  }
  /**
  @param x- integer
  @return answer, which is the square root of x, if perfect, else is -1
  */
  public static int perfectSqrt(int x)
  {
    int answer = -1;
    if (x == 0)
      answer = 0;
    else if (x > 0)
    {
      for (double i = 1; i<=x; i++)
      {
        if (x/i == i)
          answer = (int) i;
      }
    }
    return answer;
  }
}