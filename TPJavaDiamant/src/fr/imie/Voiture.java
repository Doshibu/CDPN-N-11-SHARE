package fr.imie;
import fr.imie.Mode;

/**
 * 
 */

/**
 * @author imiedev
 *
 */
public class Voiture implements IVoiture {
	
	private IVoiture comportement;

	private Integer compteur;
	private Mode mode;
	
	/**
	 * 
	 */
	public Voiture() {
		comportement=new CompVoiture(this);
		mode= Mode.ARRET;
		compteur=0;
		
	}




	@Override
	public void demarrer() {
		comportement.demarrer();
		
	}

	@Override
	public void arretter() {
		comportement.arretter();
		
	}

	@Override
	public void avancer(Integer km) {
		comportement.avancer(km);
		
	}

	@Override
	public Mode getMode() {
		return this.mode;
	}

	@Override
	public void setMode(Mode m) {
		this.mode=m;
		
	}
	
	@Override
	public Integer getCompteur() {
		return this.compteur;
	}
	
	@Override
	public void setCompteur(Integer compteur) {
		this.compteur = compteur;
	}

}
