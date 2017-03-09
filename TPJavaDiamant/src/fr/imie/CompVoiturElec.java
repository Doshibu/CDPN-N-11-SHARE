/**
 * 
 */
package fr.imie;

/**
 * @author imiedev
 *
 */
public class CompVoiturElec implements IVoitureElec {

	IVoitureElec etat;
	IVoiture compVoiture;
	
	/**
	 * @param etat
	 */
	public CompVoiturElec(IVoitureElec etat) {
		super();
		this.etat = etat;
		this.compVoiture= new CompVoiture(etat);
	}

	/* (non-Javadoc)
	 * @see fr.imie.IVoiture#arretter()
	 */
	@Override
	public void arretter() {
		compVoiture.arretter();

	}

	/* (non-Javadoc)
	 * @see fr.imie.IVoiture#avancer(java.lang.Integer)
	 */
	@Override
	public void avancer(Integer km) {
		if (etat.getCharge()<km){
			throw new RuntimeException("pas de W pour avancer");
		}
		compVoiture.avancer(km);
		etat.setCharge(etat.getCharge()-(1*km));
	}

	/* (non-Javadoc)
	 * @see fr.imie.IVoiture#demarrer()
	 */
	@Override
	public void demarrer() {
		compVoiture.demarrer();

	}

	/* (non-Javadoc)
	 * @see fr.imie.IVoiture#getCompteur()
	 */
	@Override
	public Integer getCompteur() {
		return compVoiture.getCompteur();
	}

	/* (non-Javadoc)
	 * @see fr.imie.IVoiture#setCompteur(java.lang.Integer)
	 */
	@Override
	public void setCompteur(Integer value) {
		compVoiture.setCompteur(value);

	}

	/* (non-Javadoc)
	 * @see fr.imie.IVoiture#getMode()
	 */
	@Override
	public Mode getMode() {
		return compVoiture.getMode();
	}

	/* (non-Javadoc)
	 * @see fr.imie.IVoiture#setMode(fr.imie.Mode)
	 */
	@Override
	public void setMode(Mode m) {
		compVoiture.setMode(m);

	}

	@Override
	public void recharger(Integer kw) {
		etat.setCharge(etat.getCharge()+kw);
		
	}

	@Override
	public Integer getCharge() {
		return etat.getCharge();
	}

	@Override
	public void setCharge(Integer kw) {
		etat.setCharge(kw);
		
	}

}
