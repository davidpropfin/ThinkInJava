package DavidLe.ThinkInJava;
import java.util.Random;

import sun.misc.FloatConsts;
import sun.misc.DoubleConsts;

public class loopfor  {
	
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { 
		      int x = new Random().nextInt();
		      System.out.println(x); 
		    }

//	public static int randomInt(int min, int max) {
//		int random = (int) Math.random();
//
//		
//	}
//
//	public static int[] randomArray(int n) {
//		int[] a = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = randomInt(0, 100);
//		}
//		return a;
//	}
//
//	public static int inRange(int[] a, int low, int high) {
//		int count = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] >= low && a[i] < high)
//				count++;
//		}
//		return count;
//	}
//
//	int[] counts = new int[100];for(
//	int i = 0;i<scores.length;i++)
//	{
//		int[] scores = randomArray(30);
//		int index = scores[i];
//		counts[index]++;
//	}

}

}
