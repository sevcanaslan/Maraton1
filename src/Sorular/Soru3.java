package Sorular;

public class Soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(karakterSayici("Bugün güzel bir gün", 'g'));
		System.out.println(karakterSayici("Bugün güzel bir gün", 'x'));
	}
	
	
	 public static int karakterSayici (String metin, char harf)
	 {
	     int sayi = 0;
	 
	     for (int i=0; i < metin.length(); i++)
	     {    if(metin.charAt(i) == harf)
	    	 sayi++;
	     }
	 
	     return sayi;
	}

}
