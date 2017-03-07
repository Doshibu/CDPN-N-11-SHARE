/**
 * 
 */
package fr.imie.formation.poo;

/**
 * @author imiedev
 *
 */
public class Professor extends Personne {

	private Integer salary;
	
	/**
	 * @param name
	 */
	public Professor(String name,Integer salary) {
		super(name);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		super.sayHello();
		System.out.println(String.format("et mon salaire est de %s", this.salary));
	}
	
	

}
