/**
 * 
 */
package fr.imie.formation.TP2;

import java.util.Arrays;
import java.util.List;

/**
 * @author imiedev
 *
 */
public class Square extends Rectangle {

	
	/**
	 * @param width
	 * @param height
	 */
	@Override
	public void initialise(Float[] params) {
		Float[] rectangleParams = {params[0], params[0]};
		super.initialise(rectangleParams);
	}
	
	static public String[] getBuildParams(){
		String[] out = {"coté"};
		return out;
	}

}
