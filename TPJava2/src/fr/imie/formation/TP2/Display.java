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

	public void start(AbstractFactory factory) {

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
				myShape= factory.buildShape(currentShapeDescriptor, paramsValues);	
			}
			if (myShape != null) {
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
				String.format("le périmetre de %s de couleur %s est de %s", shape.getClass().getSimpleName(),shape.getColor(), shape.perimeter()));
	}

	private void printAreaOf(Shape shape) {
		System.out.println(String.format("l'aire de %s de couleur %s est de %s", shape.getClass().getSimpleName(),shape.getColor(), shape.area()));
	}

}
