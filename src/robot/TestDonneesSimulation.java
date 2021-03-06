package robot;

import robot.io.LecteurDonnees;
import robot.io.DonneesSimulation;

import java.io.FileNotFoundException;
import java.util.zip.DataFormatException;

public class TestDonneesSimulation{
    public static void main(String[] args){
	if (args.length < 1){
	     System.out.println("Syntaxe: java TestLecteurDonnees <nomDeFichier>");
            System.exit(1);
	}
	
	try {
            DonneesSimulation Data = LecteurDonnees.creeDonnees(args[0]);
	    Data.afficheDonneesCarte();
	    Data.afficheDonneesIncendies();
	    Data.afficheDonneesRobots();
        } catch (FileNotFoundException e) {
            System.out.println("fichier " + args[0] + " inconnu ou illisible");
        } catch (DataFormatException e) {
            System.out.println("\n\t**format du fichier " + args[0] + " invalide: " + e.getMessage());
        }
	
    }
}
