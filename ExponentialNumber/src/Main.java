import java.util.Scanner;
public class Main {
		//�s de�erini 1 azaltarak yeniden us metoduna g�nderiyor.
		public static int us(int base,int exponent)
		{
		if (exponent==0)
		return 1;
		else if(base==1)
		return 1;
		else
		return base*us(base, exponent-1);

		}
		public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Taban Say�s�n� giriniz.");
		int base=scn.nextInt();
		System.out.println("�s Say�s�n� giriniz.");
		int exponent=scn.nextInt();
		
		System.out.println("Sonu� ="+us(base, exponent));

		}

}
