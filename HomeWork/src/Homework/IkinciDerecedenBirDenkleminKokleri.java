package Homework;

import java.util.Scanner;

public class IkinciDerecedenBirDenkleminKokleri {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"(Ax^2+Bx+C) �kinci Dereceden Bir Denklemdir. \n Denklemdeki sabitleri a�a��daki gibi s�rayla girin   ");

		System.out.print("a de�erini giriniz: ");
		double a = scanner.nextInt();
		System.out.print("b de�erini giriniz: ");
		double b = scanner.nextInt();
		System.out.print("c de�erini giriniz: ");
		double c = scanner.nextInt();
		
		
		double delta= (b*b)-(4*a*c);
		 if (delta >0) {
			double x1= ((-1*b)-Math.sqrt(delta))/(2*a);
			double x2= ((-1*b)+Math.sqrt(delta))/(2*a);
			System.out.println(" x1 = "+ x1   +   "   x2 =" +  x2 );		
		}
		
   if (delta<0) {
	System.out.println("Denklemin ger�el k�k� yoktur...");
}
   
   if (delta==0) {
	double x= (-1 * b) / (2* a);
	System.out.println(" K�kler e�ittir ve  x1 = x2 = "   + x);
	   
   }
		
	}

}
