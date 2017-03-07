/**
 * 
 */
package fr.imie.formation.TP2;

/**
 * @author imiedev
 *
 */
public class Circle extends Shape {

	private Float radius;
	
	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param radius
	 */
	public Circle(Float radius) {
		super();
		this.radius = radius;
	}



	/* (non-Javadoc)
	 * @see fr.imie.formation.TP2.Shape#area()
	 */
	@Override
	public Float area() {
		return (float) (Math.PI*2*this.radius);
	}

	/* (non-Javadoc)
	 * @see fr.imie.formation.TP2.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		return (float) (Math.PI*Math.pow(this.radius, 2));
	}

}
