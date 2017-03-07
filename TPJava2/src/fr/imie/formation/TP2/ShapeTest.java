/**
 * 
 */
package fr.imie.formation.TP2;

/**
 * @author imiedev
 *
 */
public class ShapeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10f,20f);
		prinatAreaOf(rectangle);
		printPerimeterOf(rectangle);

		Circle circle = new Circle(10f);
		prinatAreaOf(circle);
		printPerimeterOf(circle);
		
		Square square = new Square(10f);
		prinatAreaOf(square);
		printPerimeterOf(square);
		
		Triangle triangle = new Triangle(10f,10f,10f);
		prinatAreaOf(triangle);
		printPerimeterOf(triangle);
		
		RegularPolygon regularPolygon = new RegularPolygon(1f,1000);
		
		prinatAreaOf(regularPolygon);
		printPerimeterOf(regularPolygon);
		
		
		
	}

	private static void printPerimeterOf(Shape shape) {
		System.out.println(String.format("le périmetre de %s est de %s",shape.getClass().getSimpleName(), shape.perimeter()));
	}

	private static void prinatAreaOf(Shape shape) {
		System.out.println(String.format("l'aire de %s est de %s",shape.getClass().getSimpleName(), shape.area()));
	}

}
