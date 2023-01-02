package ihm.java.hex;

import main.java.hex.Plateau;

public interface Iihm {
	
	public int demanderTaille();
	
	public int demanderModeDeJeu();
	
	public void debutJeu(Plateau p);
	
	public void debutTour(Plateau p);
	
	public void afficherPlateau(Plateau p);
	
	public void coupIA(Plateau p, int x, int y);
	
	public String jouer(Plateau p);
}
