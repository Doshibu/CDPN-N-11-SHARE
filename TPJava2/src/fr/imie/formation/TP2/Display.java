/**
 * 
 */
package fr.imie.formation.TP2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author imiedev
 *
 */
public class Display {

	/**
	 * 
	 */
	public Display() {
	}

	public void start() {
		/*
		 * List<Shape> shapes = new ArrayList<Shape>();
		 * 
		 * Rectangle rectangle = new Rectangle(10f,20f); shapes.add(rectangle);
		 * prinatAreaOf(rectangle); printPerimeterOf(rectangle);
		 * 
		 * Circle circle = new Circle(10f); shapes.add(circle);
		 * prinatAreaOf(circle); printPerimeterOf(circle);
		 * 
		 * Square square = new Square(10f); shapes.add(square);
		 * prinatAreaOf(square); printPerimeterOf(square);
		 * 
		 * Triangle triangle = new Triangle(10f,10f,10f); shapes.add(triangle);
		 * prinatAreaOf(triangle); printPerimeterOf(triangle);
		 * 
		 * RegularPolygon regularPolygon = new RegularPolygon(1f,1000f);
		 * shapes.add(regularPolygon); prinatAreaOf(regularPolygon);
		 * printPerimeterOf(regularPolygon);
		 * 
		 * try{ Rectangle badRectangle = new Rectangle(-1f,1f); }catch
		 * (Exception e) { System.out.println(String.
		 * format("exception lors de la création d'un objet: %s",e.getMessage())
		 * ); }
		 * 
		 * this.diplaySumOfArea(shapes);
		 */

		Scanner scanner = new Scanner(System.in);

		Shape myShape;
		String[] params;
		Float[] paramsValues = null;
		Integer i;
		List<Shape> shapes = new ArrayList<>();
		do {
			myShape = null;
			Integer menuItem = 1;
			ShapeEnum[] shapeEnumValues = ShapeEnum.values();
			for (ShapeEnum shapeEnum : shapeEnumValues) {
				System.out.println(menuItem.toString().concat(" - ").concat(shapeEnum.name()));
				menuItem++;
			}

			ShapeEnum currentShapeDescriptor = null;
			String choiceString = scanner.nextLine();
			switch (choiceString) {
			case "1":
			case "Carré":
				currentShapeDescriptor = ShapeEnum.SQUARE;
				break;
			case "2":
			case "Rectangle":
				currentShapeDescriptor = ShapeEnum.RECTANGLE;
				break;
			case "3":
			case "Cercle":
				currentShapeDescriptor = ShapeEnum.CIRCLE;
				break;
			case "4":
			case "Polygone":
				currentShapeDescriptor = ShapeEnum.REGULARPOLYGON;
				break;
			case "5":
			case "Triangle":
				currentShapeDescriptor = ShapeEnum.TRIANGLE;
				break;

			}

			if (currentShapeDescriptor != null) {
				params = currentShapeDescriptor.getInitParams();
				paramsValues = new Float[params.length];
				i = 0;
				for (String param : params) {
					System.out.print("saisie du paramètre ".concat(param).concat(" : "));
					String input = scanner.nextLine();
					paramsValues[i] = Float.parseFloat(input);
					i++;
				}

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
			}
			if (myShape != null) {
				myShape.initialise(paramsValues);
				this.printAreaOf(myShape);
				shapes.add(myShape);
			}

		} while (myShape != null);

		diplaySumOfArea(shapes);

	}

	private void diplaySumOfArea(List<Shape> shapes) {
		Float sum = 0f;
		for (Shape shape : shapes) {
			sum += shape.area();
		}
		System.out.println(String.format("La somme des aires est de: %s", sum));
	}

	private void printPerimeterOf(Shape shape) {
		System.out.println(
				String.format("le périmetre de %s est de %s", shape.getClass().getSimpleName(), shape.perimeter()));
	}

	private void printAreaOf(Shape shape) {
		System.out.println(String.format("l'aire de %s est de %s", shape.getClass().getSimpleName(), shape.area()));
	}

}
