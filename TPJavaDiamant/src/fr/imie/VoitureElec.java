/**
 * 
 */
package fr.imie;

/**
 * @author imiedev
 *
 */
public class VoitureElec implements IVoitureElec {

	IVoitureElec comportement;
	private Integer compteur;
	private Mode mode;
	private Integer charge;
	/**
	 * 
	 */
	public VoitureElec() {
		super();
		comportement = new CompVoiturElec(this);
		mode= Mode.ARRET;
		compteur=0;
		charge=0;
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
		this.compteur=value;
		
	}
	@Override
	public Mode getMode() {
		return mode;
	}
	@Override
	public void setMode(Mode m) {
		this.mode= m;
		
	}
	@Override
	public void recharger(Integer kw) {
		comportement.recharger(kw);
		
	}
	@Override
	public Integer getCharge() {
		return this.charge;
	}
	@Override
	public void setCharge(Integer kw) {
		this.charge=kw;
		
	}
	
	
	
}
