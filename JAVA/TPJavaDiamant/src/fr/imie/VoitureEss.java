/**
 * 
 */
package fr.imie;

/**
 * @author imiedev
 *
 */
public class VoitureEss implements IVoitureEss{

	private Integer reservoir;
	private Integer compteur;
	private Mode mode;
	private IVoitureEss comportement;

	public Integer getReservoir() {
		return reservoir;
	}

	public void setReservoir(Integer reservoir) {
		this.reservoir = reservoir;
	}

	/**
	 * 
	 */
	public VoitureEss() {
		super();
		comportement = new CompVoitureEss(this);
		mode= Mode.ARRET;
		compteur=0;
		reservoir=0;
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
	public void demarrer() {
		comportement.demarrer();
		
	}

	@Override
	public Integer getCompteur() {
		return compteur;
	}

	@Override
	public void setCompteur(Integer value) {
		this.setCompteur(value);
		
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
	public void remplire(Integer l) {
		comportement.remplire(l);
		
	}
	


}
