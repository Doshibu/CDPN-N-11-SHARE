/**
 * 
 */
package fr.imie.formation.poo;

/**
 * @author imiedev
 *
 */
public class Personne {

	private String name;

	public Personne(String name) {
		super();
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println(String.format("My name is %s", this.name));
	}


	
}
