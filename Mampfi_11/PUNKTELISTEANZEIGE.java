import backend.anzeige.PunkteListeAnzeige;
import java.awt.Font;
import java.awt.Color;

/**
 * Diese Klasse dient zum Ver&auml;ndern der Anzeige der Punkteliste. Diese Punkteliste kann
 * &uuml;ber das Menue sichtbar gemacht werden.
 * 
 * @author Thomas Guentner 
 * @version 1.0
 */

public class PUNKTELISTEANZEIGE extends PunkteListeAnzeige
{
	// instance variables

	/**
	 * Konstructor fuer <a class="glossary autolink glossaryid55" title="Fachbegriffe zur Objektorientierten Modellierung und Programmierung: Objekte" href="http://moodle.mzml.de/moodle19_GO/mod/glossary/showentry.php?courseid=73&amp;concept=Objekte" onclick="return openpopup('/mod/glossary/showentry.php?courseid=73\&amp;concept=Objekte', 'entry', 'menubar=0,location=0,scrollbars,resizable,width=600,height=450', 0);">Objekte</a> der Klasse PUNKTELISTEANZEIGE
	 */
	public PUNKTELISTEANZEIGE()
	{
		super();
	}

	/**
	 * Mit dieser Methode kann eine neue Punkteliste mit Punkteintraegen an die PunktelisteAnzeige uebergeben werden.
	 * 
	 * @param  namensliste, punkteliste   
	 */
	public void Aktualisieren(String[] namensListe, int[] punkteListe)
	{
		super.Aktualisieren(namensListe, punkteListe);
	}
	
	/**
	 * Mit dieser Methode kann eine neue Ueberschrift fuer die Punkteliste gesetzt werden.
	 * 
	 * @param ueberschriftNeu
	 */
	public void UeberschriftSetzen(String ueberschriftNeu)
	{
	    super.UeberschriftSetzen(ueberschriftNeu);
	}
	
	/**
	 * Dient zum Setzen der Schriftart der PunkteListe
	 * @param Font schriftart
	 */
	public void SchriftartSetzen(Font schriftart)
	{
	    super.SchriftartSetzen(schriftart);
	}
	
	/**
	 * Dient zum setzen der Schriftfarbe der PunkteListe
	 * @param String schriftfarbe
	 */
	public void SchriftfarbeSetzen(String farbe)
	{
	    super.SchriftfarbeSetzen(farbe);
	}
	   
	   
}
