package fr.imie;

public interface IVoitureEss extends IVoiture{
	void remplire(Integer l);
	Integer getReservoir();
	void setReservoir(Integer l);
}
