/**
 * 
 */
package fr.imie.formation.poo.tpbases;

/**
 * @author imiedev
 *
 */
public class TP2 {
	public void start() {
		Integer nbPhotocop =45;
		Double prix=0d;
		Integer nb1 = Math.min(10,nbPhotocop);
		prix+=(nb1*0.10d);
		nbPhotocop-=nb1;
		Integer nb2 = Math.min(20,nbPhotocop);
		prix+=(nb2*0.08d);
		nbPhotocop-=nb2;
		prix+=(nbPhotocop*0.05d);
		System.out.println(String.format("le prix des photocopies est de : %s", prix));
	}

}
