package fr.imie;

public interface IVoitureHybride extends IVoitureEss,IVoitureElec {
	void switcEnergy();

	Energy getEnergy();

	void setEnergy(Energy energy);
}
