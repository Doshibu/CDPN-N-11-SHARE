package fr.imie;

public class CompVoitureHybride implements IVoitureHybride {

	private IVoitureHybride etat;
	private IVoitureEss comportementEss;
	private IVoitureElec comportementElec;
	private IVoiture comportementVoitur;
	
	public CompVoitureHybride(VoitureHybride etat) {
		super();
		this.etat=etat;
		comportementEss= new CompVoitureEss(etat);
		comportementElec = new CompVoiturElec(etat);
		comportementVoitur = new CompVoiture(etat);
	}

	@Override
	public void remplire(Integer l) {
		comportementEss.remplire(l);
		
	}

	@Override
	public Integer getReservoir() {
		return etat.getReservoir();
	}

	@Override
	public void setReservoir(Integer l) {
		etat.setReservoir(l);
		
	}

	@Override
	public void arretter() {
		comportementEss.arretter();
		comportementElec.arretter();
		
	}

	@Override
	public void avancer(Integer km) {
		try{
			avancerwhithCurrentEnergy(km);
		}catch (Exception e) {
			this.switcEnergy();
			avancerwhithCurrentEnergy(km);
		}
	}

	private void avancerwhithCurrentEnergy(Integer km) {
		switch (etat.getEnergy()) {
		case ELEC:
			comportementElec.avancer(km);
			break;
		case GASOLINE:
			comportementEss.avancer(km);
			break;
		}
	}

	@Override
	public void demarrer() {
		comportementEss.demarrer();
		comportementElec.demarrer();
		
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
	public void recharger(Integer kw) {
		comportementElec.recharger(kw);
		
	}

	@Override
	public Integer getCharge() {
		return etat.getCharge();
	}

	@Override
	public void setCharge(Integer kw) {
		etat.setCharge(kw);
		
	}

	@Override
	public void switcEnergy() {
		switch (etat.getEnergy()) {
		case GASOLINE:
			etat.setEnergy(Energy.ELEC);
			break;
		case ELEC:
			etat.setEnergy(Energy.GASOLINE);
			break;


		default:
			break;
		}
		
		System.out.println(String.format("changement d'energie : %s",etat.getEnergy()));
		
		
	}

	@Override
	public Energy getEnergy() {
		return etat.getEnergy();
	}

	@Override
	public void setEnergy(Energy energy) {
		etat.setEnergy(energy);
		
	}

}
