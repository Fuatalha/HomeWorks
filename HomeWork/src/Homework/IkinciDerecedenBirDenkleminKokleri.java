package Homework;

import java.util.Scanner;

public class IkinciDerecedenBirDenkleminKokleri {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"(Ax^2+Bx+C) Ýkinci Dereceden Bir Denklemdir. \n Denklemdeki sabitleri aþaðýdaki gibi sýrayla girin   ");

		System.out.print("a deðerini giriniz: ");
		double a = scanner.nextInt();
		System.out.print("b deðerini giriniz: ");
		double b = scanner.nextInt();
		System.out.print("c deðerini giriniz: ");
		double c = scanner.nextInt();
		
		
		double delta= (b*b)-(4*a*c);
		 if (delta >0) {
			double x1= ((-1*b)-Math.sqrt(delta))/(2*a);
			double x2= ((-1*b)+Math.sqrt(delta))/(2*a);
			System.out.println(" x1 = "+ x1   +   "   x2 =" +  x2 );		
		}
		
   if (delta<0) {
	System.out.println("Denklemin gerçel kökü yoktur...");
}
   
   if (delta==0) {
	double x= (-1 * b) / (2* a);
	System.out.println(" Kökler eþittir ve  x1 = x2 = "   + x);
	   
   }
		
	}

}
