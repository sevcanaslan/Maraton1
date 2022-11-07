package Sorular;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Geometrik Hesaplayıcıya Hoş geldiniz!");
		System.out.println(" ");
		System.out.println("*****************************");
		System.out.println("**  Geometrik Hesaplayıcı  **");
		System.out.println("*****************************");

		int kareAlan = 1;
		int kareCevre = 2;
		int dikdortgenAlan = 3;
		int dikdortgenCevre = 4;
		int daireAlan = 5;
		int daireCevre = 6;
		int cikis = 7;
		
		int sayiSecim;
		
		System.out.println("Aşağıdaki hesaplamalardan hangisini yapmak istersiniz?");
		System.out.println("Yapmak istediğiniz hesaplamanın başındaki sayıyı giriniz : ");
		System.out.println(" ");
		System.out.println("1. Kare alan hesaplama");
		System.out.println("2. Kare çevre hesaplama");
		System.out.println("3. Dikdörtgen alan hesaplama");
		System.out.println("4. Dikdörtgen çevre hesaplama");
		System.out.println("5. Daire alan hesaplama");
		System.out.println("6. Daire Çevre hesaplama");
		System.out.println("7. Çıkış");
		
		boolean check = true;
		while (check) {
			Scanner input = new Scanner(System.in);
			sayiSecim = input.nextInt();

			if (sayiSecim == kareAlan) {

				System.out.println(" Cm olarak, karenin kenar uzunluğunu giriniz: ");
				int kareKenar = input.nextInt();

				int kareAlan1 = kareKenar * kareKenar;

				System.out.println("Karenin alanı :" + kareAlan1 + " cm2");
				System.out.println("");
				System.out.println("Şimdi sıra yeni işlemde! ");

			}

			else if (sayiSecim == kareCevre) {
				System.out.println("Cm olarak, karenin kenar uzunluğunu giriniz: ");
				int kareKenar = input.nextInt();

				int kareCevre1 = kareKenar * 4;

				System.out.println("Karenin çevresi : " + kareCevre1 + " cm");
				System.out.println("");
				System.out.println("Şimdi sıra yeni işlemde! ");
			} else if (sayiSecim == dikdortgenAlan) {
				System.out.println("Cm olarak, dikdörtgenin uzun kenar uzunluğunu giriniz: ");
				int uzunKenar = input.nextInt();

				System.out.println("Cm olarak, dikdörtgenin kısa kenar uzunluğunu giriniz: ");

				int kisaKenar = input.nextInt();
				int dikdortgenAlan1 = kisaKenar * uzunKenar;

				System.out.println("Cm olarak, dikdörtgenin alanı : " + dikdortgenAlan1 + " cm2");
				System.out.println("");
				System.out.println("Şimdi sıra yeni işlemde! ");
			}

			else if (sayiSecim == dikdortgenCevre) {

				System.out.println("Cm olarak, dikdörtgenin uzun kenar uzunluğunu giriniz: ");
				int uzunKenar = input.nextInt();

				System.out.println("Cm olarak, dikdörtgenin kısa kenar uzunluğunu giriniz: ");

				int kisaKenar = input.nextInt();
				int dikdortgenCevre1 = kisaKenar * 2 + uzunKenar * 2;

				System.out.println("Cm olarak, dikdörtgenin çevresi : " + dikdortgenCevre1 + " cm");
				System.out.println("");
				System.out.println("Yeni işlem seçiniz! ");
			}
			else if (sayiSecim == daireAlan) {
				System.out.println("Cm olarak, dairenin yarıçap uzunluğunu giriniz ");
				int yaricap = input.nextInt();
				double pi = 3.16;
				double daireAlan1 = pi * yaricap * yaricap;
				System.out.println("Cm olarak, dairenin alanı : " + daireAlan1 + " cm2");
				System.out.println("");
				System.out.println("Yeni işlem seçiniz! ");

			}
			else if (sayiSecim == daireCevre) {
				System.out.println("Cm olarak, dairenin yarıçap uzunluğunu giriniz ");
				int yaricap = input.nextInt();
				double pi = 3.16;
				double daireCevre1 = pi * yaricap * 2;
				System.out.println("Cm olarak, dairenin çevresi : " + daireCevre1 + " cm");
				System.out.println("");
				System.out.println("Yeni işlem seçiniz! ");
			}
			else if (sayiSecim == cikis) {
				check = false;
				System.out.println("Programdan çıkış yapıldı!");
			}
			else {
				System.out.println("Lütfen 1-7 arası bir sayı giriniz");
			}
		}

	}

}
