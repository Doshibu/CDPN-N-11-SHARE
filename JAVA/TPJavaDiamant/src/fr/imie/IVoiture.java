package fr.imie;

public interface IVoiture {

	void arretter();
	void avancer(Integer km);
	void demarrer();	
	
	Integer getCompteur();
	void setCompteur(Integer value);
	Mode getMode();
	void setMode(Mode m);

}
