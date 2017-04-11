package fr.imie;

import javax.management.RuntimeErrorException;

public class CompVoiture implements IVoiture {

	IVoiture etat;
	
	/**
	 * @param etat
	 */
	public CompVoiture(IVoiture etat) {
		super();
		this.etat = etat;
	}

	@Override
	public void demarrer() {
		etat.setMode(Mode.MARCHE);

	}

	@Override
	public void arretter() {
		etat.setMode(Mode.ARRET);

	}

	@Override
	public void avancer(Integer km) {
		if (etat.getMode()==Mode.MARCHE){
			etat.setCompteur(etat.getCompteur()+km);
		}else{
			throw new RuntimeException("impossible d'avancer si la voiture n'est pas démarrée");
		}

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

}
