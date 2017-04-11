package fr.imie.formation.TP2;

public enum ShapeEnum {
	SQUARE("cote"),
	RECTANGLE("lageur","longueur"),
	CIRCLE("rayon"),
	REGULARPOLYGON("rayon","nb côté"),
	TRIANGLE("coté 1","coté2","coté 3");
	private String[] initParams;
	ShapeEnum(String...initParams){
		this.initParams=initParams;
	}
	String[] getInitParams(){
		return initParams;
	}
	

}
