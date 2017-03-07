/**
 * 
 */
package fr.imie.formation.TP2;

/**
 * @author imiedev
 *
 */
public class Triangle extends Shape {

	private Float side1;
	private Float side2;
	private Float side3;

	/**
	 * 
	 */
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(Float side1, Float side2, Float side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imie.formation.TP2.Shape#area()
	 */
	@Override
	public Float area() {
		Float p = this.perimeter() / 2;
		return (float) Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imie.formation.TP2.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		// TODO Auto-generated method stub
		return side1 + side2 + side3;
	}

}
