package fr.imie.formation.poo.tpbases;

public class TP1 {
	public void start() {
		Integer age = 11;
		String categorie = null;
		if (age > 6) {
			if (age < 8) {
				categorie = "poussin";
			} else if (age < 10) {
				categorie = "pupille";
			} else if (age < 12) {
				categorie = "minime";
			} else {
				categorie = "cadet";
			}
		}
		System.out.println(categorie);
	}
}
