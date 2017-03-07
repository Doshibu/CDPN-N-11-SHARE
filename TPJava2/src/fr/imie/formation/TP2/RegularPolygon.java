/**
 * 
 */
package fr.imie.formation.TP2;

/**
 * @author imiedev
 *
 */
public class RegularPolygon extends Shape {
	
	private Float radius;
	private Integer sideNb;
	private Float sideSize;

	/**
	 * 
	 */
	public RegularPolygon() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @param radius
	 * @param sideNb
	 * @param sideSize
	 */
	public RegularPolygon(Float radius, Integer sideNb) {
		super();
		this.radius = radius;
		this.sideNb = sideNb;
		this.sideSize = (float) (2*radius*Math.sin(Math.PI/sideNb));
	}



	/* (non-Javadoc)
	 * @see fr.imie.formation.TP2.Shape#area()
	 */
	@Override
	public Float area() {
		Triangle triangle = new Triangle(this.radius,this.radius,this.sideSize);
		return this.sideNb*triangle.area();
	}

	/* (non-Javadoc)
	 * @see fr.imie.formation.TP2.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		// TODO Auto-generated method stub
		return sideNb*sideSize;
	}

}
