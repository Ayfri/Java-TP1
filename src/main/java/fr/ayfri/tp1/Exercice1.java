package fr.ayfri.tp1;

import fr.ayfri.Exercice;
import fr.ayfri.inputs.NumberInputManager;

/**
 * @author Pierre
 */
public class Exercice1 extends Exercice<NumberInputManager> {
	public Exercice1() {
		title = "TP 1.1 : Racine d’un nombre";
		description = """
				Écrire un programme qui calcule la racine carrée de nombres fournis par l’utilisateur.
				Ce programme devra afficher une erreur si l’utilisateur fournit des valeurs négatives, et s’arrêter lorsque l’utilisateur entre la valeur 0.
			""".stripIndent();

		inputManager = new NumberInputManager("Entrez une valeur positive (0 pour quitter) : ", 0);
	}

	public static void main(String[] args) {
		new Exercice1().run();
	}

	@Override
	public void run() {
		long a;

		do {
			a = inputManager.getLong();
			if (a != 0) {
				System.out.println("La racine carrée de " + a + " est " + getSqrt(a));
			}
		} while (a != 0);
		System.out.println("Fin du programme.");
	}

	private double getSqrt(long a) {
		return Math.sqrt(a);
	}
}
