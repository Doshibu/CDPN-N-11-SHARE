/**
 * 
 */
package fr.imie.formation.TP2;

/**
 * @author imiedev
 *
 */
public abstract class Shape {	
	private String color;
	
	public abstract Float area();
	public abstract Float perimeter();
	public abstract void initialise(Float[] params);
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	
	

}
