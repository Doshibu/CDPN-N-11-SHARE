/**
 * 
 */
package fr.imie;

/**
 * @author imiedev
 *
 */
public class VoitureHybride implements IVoitureHybride {
	private Integer reservoir;
	private Integer charge;
	private Integer compteur;
	private Mode mode;
	private Energy energy;
	private IVoitureHybride comportement;
	/**
	 * 
	 */
	public VoitureHybride() {
		super();
		comportement = new CompVoitureHybride(this);
		mode= Mode.ARRET;
		energy=Energy.ELEC;
		compteur=0;
		reservoir=0;
		charge=0;
	}
	public Integer getReservoir() {
		return reservoir;
	}
	public void setReservoir(Integer reservoir) {
		this.reservoir = reservoir;
	}
	public Integer getCharge() {
		return charge;
	}
	public void setCharge(Integer charge) {
		this.charge = charge;
	}
	public Integer getCompteur() {
		return compteur;
	}
	public void setCompteur(Integer compteur) {
		this.compteur = compteur;
	}
	public Mode getMode() {
		return mode;
	}
	public void setMode(Mode mode) {
		this.mode = mode;
	}
	
	@Override
	public Energy getEnergy() {
		return energy;
	}
	
	@Override
	public void setEnergy(Energy energy) {
		this.energy = energy;
	}
	@Override
	public void remplire(Integer l) {
		comportement.remplire(l);
		
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
	public void recharger(Integer kw) {
		comportement.recharger(kw);
		
	}
	@Override
	public void switcEnergy() {
		comportement.switcEnergy();
		
	}
	
	

}
