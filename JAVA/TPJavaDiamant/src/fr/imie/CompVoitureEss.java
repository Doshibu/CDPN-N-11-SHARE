package fr.imie;

public class CompVoitureEss implements IVoitureEss {

	IVoitureEss etat;
	IVoiture compVoiture;
	
	/**
	 * @param etat
	 */
	public CompVoitureEss(IVoitureEss etat) {
		super();
		this.etat = etat;
		this.compVoiture=new CompVoiture(etat);
	}

	@Override
	public void arretter() {
		compVoiture.arretter();

	}

	@Override
	public void avancer(Integer km) {
		if (etat.getReservoir()<(km*2)){
			throw new RuntimeException("pas d'essence pour avancer");
		}
		compVoiture.avancer(km);
		etat.setReservoir(etat.getReservoir()-(2*km));
		compVoiture.avancer(km);

	}

	@Override
	public void demarrer() {
		compVoiture.demarrer();

	}

	@Override
	public Integer getCompteur() {
		return etat.getCompteur();
	}

	@Override
	public void setCompteur(Integer value) {
		etat.setCompteur(value);

	}

	@Override
	public Mode getMode() {
		return etat.getMode();
	}

	@Override
	public void setMode(Mode m) {
		etat.setMode(m);

	}

	@Override
	public void remplire(Integer l) {
		this.etat.setReservoir(this.etat.getReservoir()+l);

	}

	@Override
	public Integer getReservoir() {
		return etat.getReservoir();
	}

	@Override
	public void setReservoir(Integer l) {
		etat.setReservoir(l);

	}

}
