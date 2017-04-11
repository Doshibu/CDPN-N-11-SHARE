/**
 * 
 */
package fr.imie.formation.TP2;

/**
 * @author imiedev
 *
 */
public class ConcreteFactory2 implements AbstractFactory {

	private static ConcreteFactory2 instance;
	
	/**
	 * 
	 */
	private ConcreteFactory2() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized ConcreteFactory2 getInstance(){
		if(instance==null){
			instance=new ConcreteFactory2();
		}
		return instance;
	}

	/* (non-Javadoc)
	 * @see fr.imie.formation.TP2.AbstractFActory#buildShape(fr.imie.formation.TP2.ShapeEnum, java.lang.Float[])
	 */
	@Override
	public Shape buildShape(ShapeEnum currentShapeDescriptor,Float[] paramsValues){
		Shape myShape = null;
		switch (currentShapeDescriptor) {
		case SQUARE:
			myShape = new Square();
			break;
		case RECTANGLE:
			myShape = new Rectangle();
			break;
		case CIRCLE:
			myShape = new Circle();
			break;
		case REGULARPOLYGON:
			myShape = new RegularPolygon();
			break;
		case TRIANGLE:
			myShape = new Triangle();
			break;

		default:
			break;
		}
		
		if (myShape != null) {
			myShape.initialise(paramsValues);
			myShape.setColor("green");
		}
		return myShape;
	}
	
	
}
