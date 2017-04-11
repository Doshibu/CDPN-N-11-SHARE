/**
 * 
 */
package fr.imie.formation.poo;

/**
 * @author imiedev
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne personne = new Student("Alice");
		personne.sayHello();
		
		Personne personne2 = new Professor("Chapelier",30000);
		personne2.sayHello();
		
	}
	
	

}
