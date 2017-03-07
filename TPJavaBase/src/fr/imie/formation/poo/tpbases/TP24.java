/**
 * 
 */
package fr.imie.formation.poo.tpbases;

import java.util.Arrays;

/**
 * @author imiedev
 *
 */
public class TP24 {
	public void start() {
		Integer[] tab = {4,6,8,1,3,6};
		for (int i = tab.length-1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if(tab[j]>tab[j+1]){
					Integer tmp = tab[j];
					tab[j]=tab[j+1];
					tab[j+1]=tmp;
				}
			}
		}
		System.out.print(Arrays.toString(tab));
	}
	
	public void startBySort() {
		Integer[] tab = {4,6,8,1,3,6};
		Arrays.sort(tab);
		System.out.print(Arrays.toString(tab));
	}
}
