/**
 * 
 */
package fr.imie.formation.TP2;

/**
 * @author imiedev
 *
 */
public class Rectangle implements Shape {

	private Float width;
	private Float height;
	

	/**
	 * @param width
	 * @param height
	 */
	@Override
	public void initialise(Float[] params) {
		if (params[0]<0 || params[1]<0){
			throw new IllegalArgumentException("la largeur et la longueur doit être supérieur à 0");
		}
		
		this.width = params[0];
		this.height = params[1];
	}

	static public String[] getBuildParams(){
		String[] out = {"largeur","hauteur"};
		return out;
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
