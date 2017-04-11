package fr.imie;

public interface IVoitureElec extends IVoiture {
	void recharger(Integer kw);
	Integer getCharge();
	void setCharge(Integer kw);
	
}
