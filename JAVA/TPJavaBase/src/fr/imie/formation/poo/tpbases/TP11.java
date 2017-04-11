/**
 * 
 */
package fr.imie.formation.poo.tpbases;

/**
 * @author imiedev
 *
 */
public class TP11 {
	public void start(){
		Integer[] tab = {4,6,8,1,3,6};
		Double sum=0d;
		for (Integer value : tab) {
			sum+=value;
		}
		Double moy= sum/tab.length;
		
		System.out.println(moy);
	}

}
