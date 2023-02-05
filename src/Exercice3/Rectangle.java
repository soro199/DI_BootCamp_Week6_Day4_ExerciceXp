package Exercice3;

public class Rectangle {

	//Attributs
	public int longueur;
	public int largeur;

	//Constructeur avec Parametre
	public Rectangle(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	//la methode de calcul
	public int Area() {

		return longueur * largeur;
	}

}
