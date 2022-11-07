package Sorular;

public class Soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Soru1.yildizMetod();
	}
	
	public static void yildizMetod () {
		for(int i=0;i<4;i++) {
	        for(int j=0; j<6;j++) {
	            System.out.print("* ");
	        }
	        System.out.println("*");
	    }
		
		int i,k;
	    int sembol=6;        
	    for(k=0; k<9; k++) {
	        for (i=0; i <sembol; i++) {
	            System.out.print("* ");
	        }
	        System.out.println("");
	        sembol--;
	}

	}

}
