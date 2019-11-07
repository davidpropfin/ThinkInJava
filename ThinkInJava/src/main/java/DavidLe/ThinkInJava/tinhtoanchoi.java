package DavidLe.ThinkInJava;

import java.util.Scanner;


public class tinhtoanchoi {
	public static int traVeABCD(int u) {
		if (u%8==1) {
			return 1;
		}
		if (u%8==3) {
			return 3;
		}
		if (u%8==5) {
			return 5;
		}
		
		return 7;
		 
	}
	
	public static int  hienThiSo(int u) {
		int chay=u/8;
		int xuatphat=1;
		for (int i = 0; i < chay; i++) {
			
			System.out.println(xuatphat);
			if (xuatphat==u) {
				break;
			}
			xuatphat=xuatphat+2;
			
		}
		return xuatphat;
	}
	public static void main(String[] args) {
		int u;

		Scanner scan = new Scanner(System.in);
		System.out.println("nhap u");
		u = scan.nextInt();
		int chay=u/8;
		
		System.out.println("STT A B C D");
		for (int i = 0; i < chay; i++) {
			System.out.println(i + 1+"   "+traVeABCD(u)+" "+(traVeABCD(u)+2)+" "+(traVeABCD(u)+4)+" "+(traVeABCD(u)+6)) ;
			u = u - 8;

		}
		

	}
}
