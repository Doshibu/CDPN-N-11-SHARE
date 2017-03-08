/**
 * 
 */
package fr.imie.formation.TP2;

/**
 * @author imiedev
 *
 */
public class RegularPolygon implements Shape {
	
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
	@Override
	public void initialise(Float[] params) {
		this.radius = params[0];
		this.sideNb = params[1].intValue();
		this.sideSize = (float) (2*radius*Math.sin(Math.PI/sideNb));
	}
	
	static public String[] getBuildParams(){
		String[] out = {"rayon","nb de côté"};
		return out;
	}


	/* (non-Javadoc)
	 * @see fr.imie.formation.TP2.Shape#area()
	 */
	@Override
	public Float area() {
		Float[] paramsValues ={this.radius,this.radius,this.sideSize};
		Triangle triangle = new Triangle();
		triangle.initialise(paramsValues);
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
