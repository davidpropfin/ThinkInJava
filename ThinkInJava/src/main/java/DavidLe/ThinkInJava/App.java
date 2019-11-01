package DavidLe.ThinkInJava;

/**
 * Hello world!
 *
 */
public class App 
{
	public static double distance (double x1, double y1, double x2, double y2) { 
	    double dx = x2 - x1; 
	    double dy = y2 - y1; 
	    double dsquared = dx*dx + dy*dy; 
	    double result = Math.sqrt(dsquared); 
	    return result; 
	  }
	
	
	public static void countdown(int n) { 
	    if (n == 0) { 
	      System.out.println("Bum!"); 
	    } else { 
	      System.out.println(n); 
	      countdown(n-1); 
	    } 
	  }
	//double radius = distance(xc, yc, xp, yp);
	
	public static double circleArea (double xc, double yc, double xp, double yp) { 
	    double radius = distance(xc, yc, xp, yp); 
	    double area = radius*radius*3.14;
	    return area; 
	  }
	static int n=5;
	int x;
	public static int factorial(int n) { 
	    if (n == 0) { 
	      return 1; 
	    } else { 
	      int recurse = factorial(n-1); 
	      int result = n * recurse; 
	      return result; 
	    } 
	  }
	public static int fibonacci(int n) { 
	    if (n == 0 || n == 1) { 
	      return 1; 
	    } else { 
	      return fibonacci(n-1) + fibonacci(n-2); 
	    } 
	  }
	static boolean evenFlag = (n%2 == 0); // đúng nếu n chẵn 
    boolean positiveFlag = (x > 0); // đúng nếu x dương
    public static void main( String[] args )
    {
    	//System.out.println(factorial(4));
    	System.out.println(fibonacci(5));
    	
    }
    
}
