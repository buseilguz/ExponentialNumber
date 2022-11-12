import java.util.Scanner;
public class PrimeNumber2 {

	 public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("Lütfen kontrol etmek istediğiniz sayıyı giriniz.");
		 int number=scn.nextInt();
	        isPrime(number,2);

	    }
	 	//i değerini bir arttırarak metot'a tekrar gönderiyoruz.
	    static boolean isPrime(int number,int i){
	    	
	        if(i == number) {
	            System.out.println(number + " sayısı ASALDIR.");
	            return true;
	        }
	        else if (number % i == 0){
	            System.out.println(number + " sayısı ASAL DEĞİLDİR.");
	            return false;
	        }
	        return isPrime(number,i+1);
	    }
}
