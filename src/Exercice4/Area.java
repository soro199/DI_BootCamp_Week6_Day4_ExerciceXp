package Exercice4;

import java.util.Scanner;

public class Area {
	public static int largeur;
	public static  int longeur;



	public  static int returnArea() {
		return largeur * longeur;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("SVP mentionnez la largeur  ");
		Area.largeur = scan.nextInt();
		System.out.println("SVP mentionnez la longueur  ");
		Area.longeur = scan.nextInt();
		
		
		System.out.println("la largeur est :" + largeur + " la longueur est :" + longeur + "l'air est : "+ Area.returnArea() );

	}

}
