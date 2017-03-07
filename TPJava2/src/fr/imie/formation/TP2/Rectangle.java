/**
 * 
 */
package fr.imie.formation.TP2;

/**
 * @author imiedev
 *
 */
public class Rectangle extends Shape {

	private Float width;
	private Float height;
	
	/**
	 * 
	 */
	public Rectangle() {
		super();
	}
	
	

	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(Float width, Float height) {
		super();
		this.width = width;
		this.height = height;
	}



	/* (non-Javadoc)
	 * @see fr.imie.formation.TP2.Shape#area()
	 */
	@Override
	public Float area() {
		return this.width*this.height;
	}

	/* (non-Javadoc)
	 * @see fr.imie.formation.TP2.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		return (this.width+this.height)*2;
	}

}
