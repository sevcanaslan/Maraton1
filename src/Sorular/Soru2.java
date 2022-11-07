package Sorular;

public class Soru2 {

	public static void main(String[] args) {
		
		int diziMethod[] = {9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7};
		diziMethod(diziMethod);
	       
	}
		
	public static void diziMethod(int[] dizi1) {
	      int sayac=0;
	        for(int i=0;i<dizi1.length;i++) {
	        	 for(int j=i+1;j<dizi1.length;j++)
	        		 if(dizi1[i]==dizi1[j])
		              {
		                sayac++;
		                System.out.println("Dizide ilk " + dizi1[i]+" sayisi tekrar ediyor."); //maalesef kaç kere tekrar ettirdiğini yazdıramadım 
		             i=dizi1.length;j=dizi1.length;

		              }
	        }	           
	        if(sayac==0)
	        System.out.println("Tekrar eden sayı bulunamamıştır.");
	
	}

}
