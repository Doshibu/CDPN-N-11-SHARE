/**
 * 
 */
package fr.imie.formation.poo.tpbases;

/**
 * @author imiedev
 *
 */
public class TP6 {
	public Integer startBoucle(Integer value) {
		Integer decrement = value;
		Integer result = value;
		
		while (decrement>1) {
			result=result*--decrement;
		}
		
		return result;
	}
	public Integer startRecursif(Integer value) {
		Integer out=null;
		if (value<=1){
			out=1;
		}else{
			out = value*startRecursif(value-1);
		}
		return out;
		
	}
}
