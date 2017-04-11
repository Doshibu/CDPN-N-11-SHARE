/**
 * 
 */
package fr.imie.formation.poo.tpbases;

import java.util.Arrays;

/**
 * @author imiedev
 *
 */
public class TP12 {
	public void start() {
		Integer[] tab = {4,6,8,1,3,6};
		Integer tmp = tab[0];
		for (int i = 0; i < tab.length-1; i++) {
			tab[i]=tab[i+1];
		}
		tab[tab.length-1]=tmp;
		
		System.out.print(Arrays.toString(tab));
		
		
	}
}
