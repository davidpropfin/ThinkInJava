package DavidLe.ThinkInJava;

public class loop {
	public static void countdown(int n) {
		while (n > 0) {
			System.out.println(n);
			n = n - 1;
		}
		System.out.println("Bum!");
	}
	public static void printMultiples(int n, int high) {
		int i = 1;
		while (i <= high) {
			System.out.print(n * i + " ");
			i = i + 1;
		}
		System.out.println("");
		
	}

	public static void sequence(int n) {
		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0) { // n chẵn
				n = n / 2;
			} else { // n lẻ
				n = n * 3 + 1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int liz = 5;
		System.out.println(liz);
		liz = 7;
		System.out.println(liz);
		countdown(10);
		double x = 1.0;
		while (x < 10.0) {
			System.out.println(x + " " + Math.log(x));
			x = x + 1.0;
		}
		int i = 1;
//		while (i <= 6) {
//			System.out.print(2 * i + " ");
//			i = i + 1;
//		}
		System.out.println("");
		
//		while (i<=6) {
//			printMultiples(i);
//			i=i+1;
//			
//		}
		
		printMultTable(7);
		
		

	}
	public static void printMultTable(int high ) { 
	    int i = 1; 
	    while (i <= high) { 
	      printMultiples(i,i); 
	      i = i + 1; 
	    } 
	  }
	
	
	

}
