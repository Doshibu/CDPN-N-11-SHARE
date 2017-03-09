package fr.imie.formation.TP2;

public interface AbstractFactory {

	Shape buildShape(ShapeEnum currentShapeDescriptor, Float[] paramsValues);

}