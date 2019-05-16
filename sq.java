import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int x1 = in.nextInt ();
    int y1 = in.nextInt ();
    int x2 = in.nextInt ();
    int y2 = in.nextInt ();
    int x3 = in.nextInt ();
    int y3 = in.nextInt ();
    int x4 = in.nextInt ();
    int y4 = in.nextInt ();
    if ((Math.abs (y1 - y2) == Math.abs (y3 - y4))
	&& (Math.abs (x1 - x3) == Math.abs (x2 - x4)))
      System.out.print ("yes");
    else
      {
	System.out.print ("no");
      }
  }
}
