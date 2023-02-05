package Exercice2;

public class Triangle {

	//Attributs
	public int cote1 = 3;
	public int cote2 = 4;
	public int cote3 = 5;
	public int perimetre = cote1 + cote2 + cote3;
	public Double aire = (double)(cote1+cote2)/2;

	//Constructeurs sans parametre
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Fonctions d'affichages
	public void afficher() {

		System.out.println("le premier coté fait :" + cote1);
		System.out.println("le deuxième coté fait :" + cote2);
		System.out.println("le troisième coté fait :" + cote3);
		System.out.println("le Perimetre fait :" + perimetre);
		System.out.println("l'aire est :" + aire);

	}
	//Fonctions main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle T = new Triangle();
		T.afficher();

	}

}
