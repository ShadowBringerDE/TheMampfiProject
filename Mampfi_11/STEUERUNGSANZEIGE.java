//import backend.implementierung.SteuerungsAnzeige;
import backend.Ticker;
import backend.anzeige.Einstellungen;

/**Diese Klasse dient zur Anzeige der Informationen am rechten Rand und 
 * zur Anmeldung des SPIELSTEUERUNGS-Objekts am backend.
 * @author Sebastian Zinkhahn
 */
class STEUERUNGSANZEIGE extends SteuerungsAnzeige
{
	/**Der Punktestand*/
	int punkteStand;
	/**Die Anzahl der Leben*/
	int anzahlLeben;
	/**Die Nummer des Levels*/
	int levelNummer;
	/**Die Farbe, in der die Schrift angezeigt wird*/
	String schriftFarbe;
	/**Die Hintergrundfarbe des Panels*/
	String hintergrundFarbe;
	
	/**Erzeugt eine neues Objekt dieser Klasse*/
	STEUERUNGSANZEIGE()
	{
		super();
	}
	
	/** Weist dem Attribut punkteStand einen neuen Wert zu
	 * @param punkteStandNeu Der neue Wert
	 */
	void PunkteStandSetzen(int punkteStandNeu)
	{
		super.PunkteStandSetzen(punkteStandNeu);
		punkteStand = punkteStandNeu;
	}
	
	/** Weist dem Attribut anzahlLeben einen neuen Wert zu
	 * @param anzahlNeu - Der neue Wert
	 */
	void LebenSetzen(int anzahlNeu)
	{
		if(anzahlNeu>=0)
		{	
			super.LebenSetzen(anzahlNeu);
			anzahlLeben = anzahlNeu;
		}
		else System.err.println("Anzahl der Leben darf nicht negativ sein");
	}
	
	/** Weist dem Attribut levelNummer einen neuen Wert zu
	 * @param nummerNeu Der neue Wert
	 */
	void LevelSetzen(int nummerNeu)
	{
		if(nummerNeu>=0)
		{
			super.LevelSetzen(nummerNeu);
			levelNummer = nummerNeu;
		}
		else System.err.println("Nummer des Levels darf nicht negativ sein");
	}
	
	
	/** Weist dem Attribut schriftFarbe einen neuen Wert zu
	 * @param farbeNeu Der neue Wert (Name der Farbe)
	 */
	void SchriftFarbeSetzen(String farbeNeu)
	{
		super.SchriftFarbeSetzen(farbeNeu);
		schriftFarbe = farbeNeu;
	}
	
	/** Weist dem Attribut hintergrundFarbe einen neuen Wert zu
	 * @param farbeNeu Der neue Wert (Name der Farbe)
	 */
	void HintergrundFarbeSetzen(String farbeNeu)
	{
		super.HintergrundFarbeSetzen(farbeNeu);
		hintergrundFarbe = farbeNeu;
	}
	
	
	/** Meldet das &uuml;bergebene Objekt am Backend als Spielsteurung an
	 * @param steuerung Das {@link SPIELSTEUERUNG}-Objekt
	 */
	void Anmelden(SPIELSTEUERUNG steuerung)
	{
		if(super.steuerungsDummy == null)
		{
			super.Anmelden(steuerung);
		}
		else System.err.println("Es wurde schon eine Spielsteuerung angemeldet");
	}
	
	/**Setzt in der Klasse {@link Einstellungen} die Anzahl Zellen
	 * @param anzahl Die Anzahl der Zellen
	 * @return Der resultierende Zellradius
	 */
	int ZellenAnzahlSetzen(int anzahl)
	{
		Einstellungen.ZellenRadiusBerechnen(anzahl);
		return Einstellungen.ZellenRadiusGeben();
	}
	
	/**Setzt den Zellenradius (halbe Hoehe und Breite einer Zelle)auf den angegebenen Wert
	 * @param zellenRadiusNeu Der Zellenradius
	 */
	void ZellenRadiusSetzen(int zellenRadiusNeu)
	{
		Einstellungen.ZellenRadiusSetzen(zellenRadiusNeu);
	}
	
	/**Startet einen {@link Ticker}
	 * @param zeitIntervall Der Zeitabstand in welchem die Ticks kommen sollen
	 * in Millisekunden
	 */
	void TickerStarten(int zeitIntervall)
	{
		if(super.steuerungsDummy != null)
		{
			super.TickerStarten(zeitIntervall);
		}
		else System.err.println("Es muss erst eine Spielsteuerung angemeldet werden");
	}
	
	void TickerAnhalten()
	{
	    super.TickerAnhalten();
	}
	
	void LabyrinthAnzeigeLoeschen()
	{
		super.LabyrinthAnzeigeLoeschen();
	}
}