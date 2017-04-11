/**
 * 
 */
package fr.imie;

/**
 * @author imiedev
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("-------------------------------");
		System.out.println("voiture Electrique");
		IVoitureElec voitureElec = new VoitureElec();
		voitureElec.demarrer();
		voitureElec.recharger(10);
		voitureElec.avancer(3);
		System.out.println(String.format("compteur : %s ; charge : %s",voitureElec.getCompteur(),voitureElec.getCharge()));
		
		System.out.println("-------------------------------");
		System.out.println("voiture Hybride");
		IVoitureHybride voitureHybride =  new VoitureHybride();
		voitureHybride.demarrer();
		voitureHybride.recharger(10);
		voitureHybride.remplire(20);
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		System.out.println("-> recharger 20 kw");
		voitureHybride.recharger(20);
		System.out.println("-> switch manuel");
		voitureHybride.switcEnergy();
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		System.out.println("-> switch manuel");
		voitureHybride.switcEnergy();
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);
		avancer3kmHybride(voitureHybride);


	}

	private static void avancer3kmHybride(IVoitureHybride voitureHybride) {
		voitureHybride.avancer(3);
		System.out.println(String.format("compteur : %s ; charge : %s ; reservoir : %s",voitureHybride.getCompteur(),voitureHybride.getCharge(),voitureHybride.getReservoir()));
	}

}
