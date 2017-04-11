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
	@Override
	public void initialise(Float[] params) {
		if (params[0]>params[1]+params[2] || params[1]>params[0]+params[2] || params[2]> params[0]+params[1]){
			throw new IllegalArgumentException("un côté de triangeme nde peut êter supérieur à la somme des deux autres");
		}
		
		this.side1 = params[0];
		this.side2 = params[1];
		this.side3 = params[2];
	}

	static public String[] getBuildParams(){
		String[] out = {"coté1","coté2","coté3"};
		return out;
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
